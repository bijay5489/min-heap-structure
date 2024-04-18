import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

import edu.uwm.cs.util.Pair;
import edu.uwm.cs351.ArrayCompleteTree;
import edu.uwm.cs351.CompleteTree;
import edu.uwm.cs351.MinHeap;
import edu.uwm.cs351.MinHeap.Spy;
import edu.uwm.cs351.TreeCompleteTree;
import junit.framework.TestCase;

public class TestInternals extends TestCase {
	protected Spy spy = new MinHeap.Spy();
	
	protected int reports;
	
	protected void assertReporting(boolean expected, Supplier<Boolean> test) {
		reports = 0;
		Consumer<String> savedReporter = spy.getReporter();
		try {
			spy.setReporter((String message) -> {
				++reports;
				if (message == null || message.trim().isEmpty()) {
					assertFalse("Uninformative report is not acceptable", true);
				}
				if (expected) {
					assertFalse("Reported error incorrectly: " + message, true);
				}
			});
			assertEquals(expected, test.get().booleanValue());
			if (!expected) {
				assertEquals("Expected exactly one invariant error to be reported", 1, reports);
			}
			spy.setReporter(null);
		} finally {
			spy.setReporter(savedReporter);
		}
	}

	protected final Comparator<Integer>
		ascending = (i1, i2) -> i1 - i2,
		descending = (i1, i2) -> i2 - i1,
		nondiscrimination = (i1, i2) -> 0,
		ignoreones = (i1, i2) -> i1/10 - i2/10;
	
	protected CompleteTree<Integer> tree;
	protected CompleteTree.Location<Integer> loc, locp;
	protected MinHeap<Integer> heap;
	
	protected boolean wellFormed() {
		return spy.wellFormed(heap);
	}
	
	protected void fill(int... nums) {
		for (int x : nums) {
			tree.add(x);
		}
	}
	
	
	/// tests of TreeCompleteTree.find
	
	protected Pair<CompleteTree.Location<Integer>, CompleteTree.Location<Integer>> find(int n) {
		return edu.uwm.cs351.TreeCompleteTree.Spy.find(tree, n);
	}
	
	public void testA() {
		tree = new TreeCompleteTree<>();
		loc = tree.add(1000);
		tree.add(1001);
		tree.add(1002);
		tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(1));
	}
	
	public void testB() {
		tree = new TreeCompleteTree<>();
		locp = tree.add(1000);
		loc = tree.add(1001);
		tree.add(1002);
		tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(2));
	}
	
	public void testC() {
		tree = new TreeCompleteTree<>();
		locp = tree.add(1000);
		tree.add(1001);
		loc = tree.add(1002);
		tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(3));
	}
	
	public void testD() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		locp = tree.add(1001);
		tree.add(1002);
		loc = tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(4));
	}
	
	public void testE() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		locp = tree.add(1001);
		tree.add(1002);
		tree.add(1003);
		loc = tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(5));
	}
	
	public void testF() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		tree.add(1001);
		locp = tree.add(1002);
		tree.add(1003);
		tree.add(1004);
		loc = tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(6));
	}
	
	public void testG() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		tree.add(1001);
		locp = tree.add(1002);
		tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		loc = tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(7));
	}
	
	public void testH() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		tree.add(1001);
		tree.add(1002);
		locp = tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		loc = tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(8));
	}
	
	public void testI() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		tree.add(1001);
		tree.add(1002);
		locp = tree.add(1003);
		tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		loc = tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(9));
	}
	
	public void testJ() {
		tree = new TreeCompleteTree<>();
		tree.add(1000);
		tree.add(1001);
		tree.add(1002);
		tree.add(1003);
		locp = tree.add(1004);
		tree.add(1005);
		tree.add(1006);
		tree.add(1007);
		tree.add(1008);
		assertEquals(new Pair<>(loc, locp), find(10));
	}
	
	/// tests of min heap's invariant
	
	public void testK() {
		heap = spy.createMinHeap(null, (i1,i2) -> i1-i2);
		assertReporting(false, () -> wellFormed());
	}
	
	public void testL() {
		heap = spy.createMinHeap(new ArrayCompleteTree<>(), null);
		assertReporting(false, () -> wellFormed());
	}
	
	public void testM() {
		tree = new ArrayCompleteTree<>();
		heap = spy.createMinHeap(tree, nondiscrimination);
		assertReporting(true, () -> wellFormed());
	}
	
	public void testN() {
		tree = new TreeCompleteTree<>();
		heap = spy.createMinHeap(tree, descending);
		assertReporting(true, () -> wellFormed());
	}
	
	public void testO() {
		tree = new ArrayCompleteTree<>();
		fill(199,-20,1,1000);
		heap = spy.createMinHeap(tree, nondiscrimination);
		assertReporting(true, () -> wellFormed());
	}
	
	public void testP() {
		tree = new TreeCompleteTree<>();
		fill(100,50,10,30,40,4);
		heap = spy.createMinHeap(tree, descending);
		assertReporting(true, () -> wellFormed());
	}
	
	public void testQ() {
		tree = new ArrayCompleteTree<>();
		fill(199,-20,1,1000);
		heap = spy.createMinHeap(tree, ascending);
		assertReporting(false, () -> wellFormed());
	}
	
	public void testR() {
		tree = new ArrayCompleteTree<>();
		fill(199,-20,1,1000);
		heap = spy.createMinHeap(tree, descending);
		assertReporting(false, () -> wellFormed());
	}
	
	public void testS() {
		tree = new ArrayCompleteTree<>();
		fill(12,10,19,23,12,15,33);
		heap = spy.createMinHeap(tree, ignoreones);
		assertReporting(true, () -> wellFormed());
	}
	
	public void testT() {
		tree = new ArrayCompleteTree<>();
		fill(12,10,29,23,12,15,33);
		heap = spy.createMinHeap(tree, ignoreones);
		assertReporting(false, () -> wellFormed());
	}
}
