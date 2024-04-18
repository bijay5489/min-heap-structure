//bijay panta
package edu.uwm.cs351;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/**
 * A dynamic-array implementation of the CompleteTree interface.
 */
public class ArrayCompleteTree<E> implements CompleteTree<E> {
	private static final int INITIAL_CAPACITY = 10;
	
	private E[] data;
	private int manyItems;
	
	private static Consumer<String> reporter = (s) -> { System.err.println("Invariant error: " + s); };

	private boolean report(String error) {
		reporter.accept(error);
		return false;
	}
	
	private boolean wellFormed() {
		if (data == null) return report("array is null");
		if (manyItems < 0) return report("manyItems is negative");
		if (manyItems > data.length) return report("manyItems is too many: " + manyItems + " > capacity = " + data.length);
		return true;
	}
	
	/**
	 * Create a new array of the element type.
	 * @param cap number of elements to create array
	 * @return array of the required size (that pretends to be
	 * of the required type -- do not let this array escape the scope
	 * of this class).
	 */
	@SuppressWarnings("unchecked")
	private E[] makeArray(int cap) {
		return (E[]) new Object[cap];
	}
	
	/**
	 * Ensure that the underlying array has at least the given 
	 * capacity.  If it's necessary to allocate an array,
	 * we allocate one that is at least twice as long.
	 * @param minimumCapacity minimum number of elements needed
	 */
	private void ensureCapacity(int minimumCapacity) {
		if (data.length >= minimumCapacity) return;
		int newCap = data.length * 2;
		if (newCap < minimumCapacity) newCap = minimumCapacity;
		E[] newData = makeArray(newCap);
		for (int i = 0; i < manyItems; ++i) {
			newData[i] = data[i];
		}
		data = newData;
	}

	/**
	 * Create an empty complete tree.
	 */
	public ArrayCompleteTree() {
		data = makeArray(INITIAL_CAPACITY);
		assert wellFormed(): "invariant broken by constructor";
	}
	
	// TODO
	// We don't use identity on locations; you can create a new Location
	// whenever you need to return a location.

	private class Location implements CompleteTree.Location<E> {
		private final int index; // 1-based index into tree

		Location(int index) {
			if (index < 1) throw new IllegalArgumentException("cannot use a negative index");
			this.index = index;
		}
		
		// TODO: implement required Location methods
		// You will need to figure out the (simple) pattern
		// connecting parents and children location numbers.

		@Override // implementation
		public String toString() {
			return "Location(" + index + ")";
		}
		
		@Override // implementation
		public int hashCode() {
			return index;
		}

		@Override // implementation
		public boolean equals(Object obj) {
			if (!(obj instanceof ArrayCompleteTree<?>.Location)) return false;
			ArrayCompleteTree<?>.Location loc = (ArrayCompleteTree<?>.Location)obj;
			return loc.index == index;
		}

		@Override
		public E get() {
			return data[index];
		}

		@Override
		public void set(E val) {
			data[index] = val;
		}

		@Override
		public CompleteTree.Location<E> parent() {
			if (index / 2 == 0) return null;
			return new Location(index / 2);
		}

		@Override
		public CompleteTree.Location<E> child(boolean right) {
			return right 
					? 2 * index + 1 > manyItems ? null : new Location(2 * index + 1) 
					: 2 * index > manyItems ? null : new Location(2 * index);
		}
	}

	@Override
	public int size() {
		assert wellFormed() : "invariant broken in size";
		return manyItems;
	}

	@Override
	public CompleteTree.Location<E> root() {
		assert wellFormed() : "invariant broken in root";
		if (manyItems < 1) return null;
		return new Location(1);
	}

	@Override
	public CompleteTree.Location<E> last() {
		assert wellFormed() : "invariant broken in last";
		if (manyItems < 1) return null;
		return new Location(manyItems);
	}

	@Override
	public CompleteTree.Location<E> add(E value) {
		assert wellFormed() : "invariant broken in add";
		ensureCapacity(++manyItems + 1);
		data[manyItems] = value;
		assert wellFormed() : "invariant broken by add";
		return new Location(manyItems);
	}

	@Override
	public E remove() {
		assert wellFormed() : "invariant broken in remove";
		if (manyItems < 1) throw new NoSuchElementException();
		E em = data[manyItems];
		data[manyItems--] = null; // avoid loitering
		assert wellFormed() : "invariant broken by remove";
		return em;
	}
}
