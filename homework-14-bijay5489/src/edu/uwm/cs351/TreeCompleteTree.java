//bijay panta
package edu.uwm.cs351;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

import edu.uwm.cs.util.Pair;
import edu.uwm.cs.util.PowersOfTwo;

public class TreeCompleteTree<E> implements CompleteTree<E> {
	private static class Node<T> implements Location<T> {
		Node<T> parent, left, right;
		T data;
		
		Node(T data) {
			this.data = data;
		}
		
		// The following are for the purposes of clients.
		// We don't bother using them.
		@Override // required
		public T get() {
			return data;
		}
		
		@Override // required
		public void set(T val) {
			data = val;
		}
		
		@Override // required
		public Location<T> parent() {
			return parent;
		}
		
		@Override // required
		public Location<T> child(boolean right) {
			return right? this.right : left;
		}
	}
	
	private Node<E> root;
	private int manyNodes;
	// NO MORE FIELDS!
	
	private static Consumer<String> reporter = (s) -> { System.err.println("Invariant error: " + s); };

	private boolean report(String error) {
		reporter.accept(error);
		return false;
	}
	
	private boolean checkSubtree(Node<E> r, Node<E> p, int size) {
		if (r == null) {
			if (size == 0) return true;
			return report("found null tree of supposed size " + size);
		}
		if (r.parent != p) return report("Found bad parent on node with " + r.data);
		if (size <= 0) return report("a non-empty subtree cannot have size = " + size);
		int power = PowersOfTwo.next(size/2);
		int prev = power/2;
		int left = (power+prev > size) ? (size - prev) : power-1;
		return checkSubtree(r.left, r, left) && checkSubtree(r.right, r, size - left - 1);
	}
	
	private boolean wellFormed() {
		return checkSubtree(root, null, manyNodes);
	}

	/**
	 * Create an empty complete tree.
	 */
	public TreeCompleteTree() {
		root = null;
		manyNodes = 0;
		assert wellFormed(): "invariant broken by constructor";
	}
	
	/**
	 * Locate a node in the tree using the algorithm
	 * explained in Activity 14.  It will start with the root and then
	 * go left or right at each step depending on what the algorithm says.
	 * It will return the "lag" (parent) pointer too, which will make it 
	 * easier to handle additions and removals.
	 * <p>
	 * If the node is not in the tree yet, the node may be null.
	 * If the node is at the root, the parent may be null.
	 * <p>
	 * This is useful for accessing the last element, including before we add 
	 * or remove it.
	 * @param n number of node to locate, one-based.
	 * It must be positive and must be no more than one more than 
	 * manyNodes.
	 * @return two nodes, either of which could be null,
	 * the first is the node itself, and the second is its parent
	 */
	private Pair<Node<E>, Node<E>> find(int n) { 
		if (n <= 0 || n > manyNodes + 1) throw new IllegalArgumentException("bad index " + n);
		Node<E> parent = null;
		Node<E> res = root;
		String binary = Integer.toBinaryString(n);
		if (binary.length() == 1) return new Pair<>(res, parent);
		binary = binary.substring(1, binary.length());
		while (binary.length() > 0) {
			parent = res;
			if (binary.charAt(0) == '0') {
				res = res.left;
			} else {
				res = res.right;
			}
			
			binary = binary.substring(1, binary.length());
		}
		
		return new Pair<>(res, parent);
		// You will need to use PowersOfTwo to find the power
		// of two that represents the first bit in the number.
		// This is the largest power of two which is *less*
		// than the number.  You can compute this as the *next* power of two after
		// half the number.
	}
	
	// TODO: Implement everything
	// Our solution uses "find" three separate times
	
	public static class Spy {
		public static <E> Pair<Location<E>,Location<E>> find(CompleteTree<E> tree, int n) {
			Pair<Node<E>, Node<E>> pair = ((TreeCompleteTree<E>)tree).find(n);
			return new Pair<>(pair.fst(), pair.snd());
		}
	}

	@Override
	public int size() {
		assert wellFormed() : "invariant broken in size";
		return manyNodes;
	}

	@Override
	public Location<E> root() {
		assert wellFormed() : "invariant broken in root";
		return root;
	}

	@Override
	public Location<E> last() {
		assert wellFormed() : "invariant broken in last";
		if (root == null) return null;
		return find(manyNodes).fst();
	}

	@Override
	public Location<E> add(E value) {
		assert wellFormed() : "invariant broken in add";
		manyNodes++;
		
		if (root == null) {
			root = new Node<>(value);
			assert wellFormed() : "invariant broken by add";
			return root;
		} else {
			Node<E> p = find(manyNodes).snd();
			if (p.left == null) {
				p.left = new Node<>(value);
				p.left.parent = p;
				assert wellFormed() : "invariant broken by add";
				return p.left;
			} else {
				p.right = new Node<>(value);
				p.right.parent = p;
				assert wellFormed() : "invariant broken by add";
				return p.right;
			}
		}
	}

	@Override
	public E remove() {
		assert wellFormed() : "invariant broken in remove";
		if (root == null) throw new NoSuchElementException();
		if (manyNodes == 1) {
			E data = root.data;
			root = null;
			manyNodes = 0;
			assert wellFormed() : "invariant broken by remove";
			return data;
		}
		
		Pair<Node<E>, Node<E>> pair = find(manyNodes--);
		if (pair.snd().left == pair.fst()) {
			pair.snd().left = null;
		} else {
			pair.snd().right = null;
		}
		
		assert wellFormed() : "invariant broken by remove";
		return pair.fst().data;
	}
}
