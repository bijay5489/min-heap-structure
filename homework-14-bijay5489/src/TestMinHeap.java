import java.util.Comparator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.ArrayCompleteTree;
import edu.uwm.cs351.CompleteTree;
import edu.uwm.cs351.MinHeap;
import edu.uwm.cs351.TreeCompleteTree;

public class TestMinHeap extends LockedTestCase {
    protected static void assertException(Class<? extends Throwable> c, Runnable r) {
    	try {
    		r.run();
    		assertFalse("Exception should have been thrown",true);
        } catch (RuntimeException ex) {
        	if (!c.isInstance(ex)) {
        		ex.printStackTrace();
        	}
        	assertTrue("should throw exception of " + c + ", not of " + ex.getClass(), c.isInstance(ex));
        }	
    }	

    protected CompleteTree<String> tree;
    protected MinHeap<String> heap;
    
	protected Comparator<String> nullOKcomparator = (s1,s2) -> {
		if (s1 == null && s2 == null) return 0;
		if (s1 == null) return -1;
		if (s2 == null) return 1;
		return s1.compareTo(s2);
	};
	
	@Override
	protected final void setUp() {
		try {
			assert tree.root() == null;
			throw new IllegalStateException("assertions must be enabled to run this test");
		} catch (NullPointerException ex) {
			// OK!
		}
		tree = new ArrayCompleteTree<>();
		heap = new MinHeap<>(tree, String.CASE_INSENSITIVE_ORDER);
	}

	protected String toString(CompleteTree<String> t) {
		Queue<CompleteTree.Location<String>> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder("[");
		q.offer(t.root());
		while (q.peek() != null) {
			CompleteTree.Location<String> loc = q.poll();
			q.offer(loc.left());
			q.offer(loc.right());
			if (sb.length() > 1) {
				sb.append(", ");
			}
			sb.append(loc.get());
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	public void test() {
		heap.add("We");
		heap.add("are");
		heap.add("learning");
		// NB: Case insensitive order (min-heap)
		assertEquals("[are, We, learning]", toString(tree));
		// adding more elements
		heap.add("about");
		heap.add("min");
		heap.add("heaps");
		heap.add("now");
		assertEquals(Ts(1359160201), toString(tree));
		assertEquals(Ts(641328049), heap.removeMin());
		assertEquals(Ts(1668480137), toString(tree));		
	}
	
	
	public void testA0() {
		// do nothing -- checking that constructor worked
	}
	
	public void testA1() {
		heap = new MinHeap<>(new TreeCompleteTree<>(), null); // natural
	}
	
	public void testA2() {
		assertException(NullPointerException.class, () -> new MinHeap<>(null, String.CASE_INSENSITIVE_ORDER));
	}
	
	public void testA3() {
		tree.add("apples");
		assertException(IllegalArgumentException.class, () -> new MinHeap<>(tree, String.CASE_INSENSITIVE_ORDER));		
	}
	
	
	public void testB0() {
		assertEquals(0, heap.size());
	}
	
	public void testB1() {
		assertException(NoSuchElementException.class, () -> heap.min());		
	}
	
	public void testB2() {
		heap = new MinHeap<>(new TreeCompleteTree<>(), null); // natural
		assertEquals(0, heap.size());
	}
	
	
	public void testC0() {
		heap.add("hello");
		assertEquals(1, heap.size());
	}
	
	public void testC1() {
		heap.add("world");
		assertEquals("world", heap.min());
	}
	
	public void testC2() {
		heap = new MinHeap<>(tree, (s1,s2) -> 0);
		heap.add(null); // comparator is OK with it
		assertEquals(1, heap.size());
	}
	
	public void testC3() {
		heap = new MinHeap<>(tree, (s1,s2) -> 0);
		heap.add(null);
		assertNull(heap.min());
	}
	
	
	public void testD0() {
		heap.add("hello");
		heap.add("WORLD");
		assertEquals(2, heap.size());
	}

	public void testD1() {
		heap.add("WORLD");
		heap.add("hello");
		assertEquals("hello", heap.min());		
	}
	
	public void testD2() {
		heap.add("hello");
		heap.add("WORLD");
		assertEquals("hello", heap.min());				
	}
	
	public void testD3() {
		heap.add("HELLO");
		heap.add("world");
		assertEquals("HELLO", heap.min());	
	}
	
	public void testD4() {
		heap = new MinHeap<>(tree, (s1,s2) -> 0);
		heap.add(null);
		heap.add("bread");
		assertNull(heap.min());
	}
	
	public void testD5() {
		heap = new MinHeap<>(tree, (s1,s2) -> 0);
		heap.add("celery");
		heap.add(null);
		assertEquals(2, heap.size());
	}
	
	public void testD6() {
		heap = new MinHeap<>(tree, (s1,s2) -> 0);
		heap.add("donuts");
		heap.add(null);
		assertEquals("donuts", heap.min());
	}
	
	public void testD7() {
		heap = new MinHeap<>(tree, nullOKcomparator);
		heap.add("eggs");
		heap.add(null);
		assertEquals(null, heap.min());
	}
	
	public void testD8() {
		heap = new MinHeap<>(tree, nullOKcomparator);
		heap.add(null);
		heap.add(null);
		assertEquals(null, heap.min());
		assertEquals(2, heap.size());
	}
	
	
	public void testE0() {
		heap.add("eggs");
		heap.add("grapes");
		heap.add("carrots");
		assertEquals("carrots", heap.min());
	}
	
	public void testE1() {
		heap.add("celery");
		heap.add("tea");
		heap.add("lemons");
		assertEquals("celery", heap.min());
	}
	
	public void testE2() {
		heap.add("kale");
		heap.add("oranges");
		heap.add("Melon");
		// checking that "oranges" didn't get bumped:
		assertEquals("oranges", tree.root().left().get());
		assertEquals("[kale, oranges, Melon]", toString(tree));
	}
	
	public void testE3() {
		heap.add("fish");
		heap.add("oranges");
		heap.add("kale");
		heap.add("eggs");
		assertEquals("eggs", heap.min());
		assertEquals("[eggs, fish, kale, oranges]", toString(tree));
	}
	
	public void testE4() {
		heap.add("lemons");
		heap.add("kale");
		heap.add("celery");
		heap.add("eggs");
		heap.add("apples");
		heap.add("bread");
		assertEquals("apples", heap.min());
		assertEquals("[apples, celery, bread, lemons, eggs, kale]", toString(tree));
	}
	
	public void testE5() {
		heap = new MinHeap<>(tree, nullOKcomparator);
		heap.add("melon");
		heap.add("fruit");
		heap.add("donuts");
		heap.add(null);
		heap.add("grapes");
		heap.add("kale");
		heap.add("apples");
		assertNull(heap.min());
		assertEquals("[null, donuts, apples, melon, grapes, kale, fruit]", toString(tree));
	}
	
	public void testE6() {
		heap.add("tea");
		heap.add("oranges");
		heap.add("nuts");
		heap.add("melon");
		heap.add("kale");
		heap.add("jello");
		heap.add("grapes");
		heap.add("eggs");
		heap.add("cheese");
		heap.add("bread");
		assertEquals("[bread, cheese, jello, grapes, eggs, oranges, kale, tea, melon, nuts]", toString(tree));
	}
	
	
	
	public void testF0() {
		assertException(NoSuchElementException.class, () -> heap.removeMin());		
	}
	
	public void testF1() {
		heap.add("bread");
		assertEquals("bread", heap.removeMin());
	}
	
	public void testF2() {
		heap.add("eggs");
		heap.removeMin();
		assertEquals(0, heap.size());
	}
	
	public void testF3() {
		heap.add("apples");
		heap.add("bread");
		assertEquals("apples", heap.removeMin());
	}
	
	public void testF4() {
		heap.add("cherries");
		heap.add("celery");
		heap.removeMin();
		assertEquals(1, heap.size());
	}
	
	public void testF5() {
		heap.add("kale");
		heap.add("lemons");
		heap.removeMin();
		assertEquals("lemons", heap.min());
	}
	
	public void testF6() {
		heap.add("bread");
		heap.add("carrots");
		heap.add("celery");
		assertEquals("bread", heap.removeMin());
		assertEquals(2, heap.size());
		assertEquals("carrots", heap.min());
	}
	
	public void testF7() {
		heap.add("lemons");
		heap.add("kale");
		heap.add("celery");
		heap.add("eggs");
		heap.add("apples");
		heap.add("bread");
		assertEquals("apples", heap.removeMin());
		assertEquals("[bread, celery, kale, lemons, eggs]", toString(tree));
	}
	
	public void testF8() {
		heap = new MinHeap<>(tree, nullOKcomparator);
		heap.add("melon");
		heap.add("fruit");
		heap.add("donuts");
		heap.add(null);
		heap.add("grapes");
		heap.add("kale");
		heap.add("apples");
		assertNull(heap.removeMin());
		assertEquals("[apples, donuts, fruit, melon, grapes, kale]", toString(tree));
	}

	public void testF9() {
		heap.add("tea");
		heap.add("oranges");
		heap.add("nuts");
		heap.add("melon");
		heap.add("kale");
		heap.add("jello");
		heap.add("grapes");
		heap.add("eggs");
		heap.add("cheese");
		heap.add("bread");
		assertEquals("bread", heap.removeMin());
		assertEquals("[cheese, eggs, jello, grapes, nuts, oranges, kale, tea, melon]", toString(tree));
	}
	
	
	public void testG0() {
		heap.add("A");
		heap.add("rose");
		heap.add("is");
		heap.add("a");
		heap.add("Rose");
		heap.add("IS");
		heap.add("a");
		heap.add("ROSE");
		assertEquals("[A, a, a, rose, Rose, IS, is, ROSE]", toString(tree));
	}
	
	public void testG1() {
		heap.add("A");
		heap.add("rose");
		heap.add("is");
		heap.add("a");
		heap.add("Rose");
		heap.add("IS");
		heap.add("aa");
		heap.add("ROSE");
		assertEquals("A", heap.removeMin());
		assertEquals("[a, ROSE, aa, rose, Rose, IS, is]", toString(tree));		
	}
}
