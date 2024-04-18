import java.util.Comparator;

import edu.uwm.cs351.ArrayCompleteTree;
import edu.uwm.cs351.CompleteTree;
import edu.uwm.cs351.MinHeap;
import edu.uwm.cs351.TreeCompleteTree;
import junit.framework.TestCase;


public class TestEfficiency extends TestCase {

	private CompleteTree<Integer> tree;
	private MinHeap<Integer> heap;
	
	private Comparator<Integer> ignoreOnesDescending = (i1, i2) -> i2/10 - i1/10;
	
	private static final int POWER = 20; // 1 million entries
	private static final int MAX = 1 << POWER;
	private static final int TESTS = MAX/10;
	
	protected void setUp() throws Exception {
		super.setUp();
		try {
			assert tree.size() == TESTS : "cannot run test with assertions enabled";
		} catch (NullPointerException ex) {
			throw new IllegalStateException("Cannot run test with assertions enabled");
		}
	}
		
	
	@Override
	protected void tearDown() throws Exception {
		tree = null;
		heap = null;
		super.tearDown();
	}
	
	protected void initialize() {
		heap = new MinHeap<>(tree, ignoreOnesDescending);
		for (int i=0; i < MAX; ++i) {
			heap.add(i);
		}
	}

	public void testA() {
		tree = new ArrayCompleteTree<>();
		initialize();
		for (int i=0; i < TESTS; ++i) {
			assertEquals(MAX, heap.size());
		}
	}

	public void testB() {
		tree = new ArrayCompleteTree<>();
		initialize();
		for (int i=0; i < TESTS; ++i) {
			assertEquals((MAX-1)/10, heap.min().intValue()/10);
		}
	}
	
	public void testC() {
		tree = new TreeCompleteTree<>();
		initialize();
		for (int i=0; i < TESTS; ++i) {
			assertEquals(MAX, heap.size());
			assertEquals((MAX-1)/10, heap.min().intValue()/10);
		}
	}
	
	public void testD() {
		tree = new ArrayCompleteTree<>();
		initialize();
		for (int i=0; i < TESTS; ++i) {
			assertEquals((MAX-i-1)/10, heap.removeMin().intValue()/10);
		}
	}

	public void testE() {
		tree = new TreeCompleteTree<>();
		initialize();
		for (int i=0; i < TESTS; ++i) {
			assertEquals((MAX-i-1)/10, heap.removeMin().intValue()/10);
		}
	}

}
