import java.util.NoSuchElementException;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.CompleteTree;

public abstract class AbstractTestCompleteTree extends LockedTestCase {

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
    protected CompleteTree.Location<String> loc, root;
    protected CompleteTree.Location<String> loc1, loc2, loc3, loc4, loc5, loc6, loc7, loc8;
	
    /**
     * Initialize the "tree" field.
     */
    protected abstract void initialize();
    
	@Override
	protected final void setUp() {
		try {
			assert tree.root() == null;
			throw new IllegalStateException("assertions must be enabled to run this test");
		} catch (NullPointerException ex) {
			// OK!
		}
		initialize();
		assertNotNull("did not initiualize tree", tree);
	}
	
	
	/// Locked tests
	
	
	
	/// text0x: simple tests on trees
	
	public void test00() {
		assertEquals(0, tree.size());
		assertNull(tree.root());
		assertNull(tree.last());
	}
	
	public void test01() {
		loc = tree.add("A");
		assertNotNull(loc);
		assertEquals(1, tree.size());
		assertEquals(loc, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("A", loc.get());
	}
	
	public void test02() {
		root = tree.add("B");
		loc = tree.add("C");
		assertNotNull(loc);
		assertEquals(2, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("C", loc.get());
	}
	
	public void test03() {
		root = tree.add("D");
		tree.add("E");
		loc = tree.add("F");
		assertNotNull(loc);
		assertEquals(3, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("F", loc.get());
	}
	
	public void test04() {
		root = tree.add("G");
		tree.add("H");
		tree.add("I");
		loc = tree.add("J");
		assertNotNull(loc);
		assertEquals(4, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("J", loc.get());
	}
	
	public void test05() {
		root = tree.add("K");
		tree.add("L");
		tree.add("M");
		tree.add("N");
		loc = tree.add("O");
		assertNotNull(loc);
		assertEquals(5, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("O", loc.get());
	}
	
	public void test06() {
		root = tree.add("P");
		tree.add("Q");
		tree.add("R");
		tree.add("S");
		tree.add("T");
		loc = tree.add("U");
		assertNotNull(loc);
		assertEquals(6, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("U", loc.get());
	}
	
	public void test07() {
		root = tree.add("V");
		tree.add("W");
		tree.add("X");
		tree.add("Y");
		tree.add("Z");
		tree.add("0");
		loc = tree.add("1");
		assertNotNull(loc);
		assertEquals(7, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("1", loc.get());
	}

	public void test08() {
		root = tree.add("2");
		tree.add("3");
		tree.add("4");
		tree.add("5");
		tree.add("6");
		tree.add("7");
		tree.add("8");
		loc = tree.add("9");
		assertNotNull(loc);
		assertEquals(8, tree.size());
		assertEquals(root, tree.root());
		assertEquals(loc, tree.last());
		assertEquals("9", loc.get());
	}
	
	public void test09() {
		root = tree.add(null);
		tree.add("!");
		tree.add("@");
		tree.add("#");
		tree.add(null);
		assertEquals(5, tree.size());
		assertEquals(root, tree.root());
		assertEquals(null, tree.last().get());
	}
	
	
	/// test1x: test parent

	public void test11() {
		loc = tree.add("a");
		assertNull(loc.parent());
	}
		
	public void test12() {
		root = tree.add("b");
		loc = tree.add("c");
		assertEquals(root, loc.parent());
		assertNull(root.parent());
	}
	
	public void test13() {
		root = tree.add("d");
		tree.add("e");
		loc = tree.add("f");
		assertEquals(root, loc.parent());
		assertNull(root.parent());
	}
	
	public void test14() {
		root = tree.add("g");
		loc1 = tree.add("h");
		tree.add("i");
		loc = tree.add("j");
		assertEquals(loc1, loc.parent());
		assertEquals(root, loc1.parent());
		assertNull(root.parent());
	}

	public void test15() {
		root = tree.add("k");
		loc1 = tree.add("l");
		tree.add("m");
		tree.add("n");
		loc = tree.add("o");
		assertEquals(loc1, loc.parent());
		assertEquals(root, loc1.parent());
		assertNull(root.parent());		
	}
	
	public void test16() {
		root = tree.add("p");
		tree.add("q");
		loc1 = tree.add("r");
		tree.add("s");
		tree.add("t");
		loc = tree.add("u");
		assertEquals(loc1, loc.parent());
		assertEquals(root, loc1.parent());
		assertNull(root.parent());		
	}
	
	public void test17() {
		root = tree.add("v");
		tree.add("w");
		loc1 = tree.add("x");
		tree.add("y");
		tree.add("z");
		tree.add("0");
		loc = tree.add("1");
		assertEquals(loc1, loc.parent());
		assertEquals(root, loc1.parent());
		assertNull(root.parent());		
	}

	public void test18() {
		root = tree.add("2");
		loc1 = tree.add("3");
		tree.add("4");
		loc2 = tree.add("5");
		tree.add("6");
		tree.add("7");
		tree.add("8");
		loc = tree.add("9");
		assertEquals(loc2, loc.parent());
		assertEquals(loc1, loc2.parent());
		assertEquals(root, loc1.parent());
	}

	
	/// test3x: now check "child".
	
	public void test21() {
		loc1 = tree.add("A");
		assertNull(loc1.left());
		assertNull(loc1.right());
	}
	
	public void test22() {
		loc1 = tree.add("B");
		loc2 = tree.add("C");
		
		assertEquals(loc2, loc1.left());
		assertNull(loc1.right());
		assertNull(loc2.left());
		assertNull(loc2.right());
	}
	
	public void test23() {
		loc1 = tree.add("D");
		loc2 = tree.add("E");
		loc3 = tree.add("F");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertNull(loc2.left());
		assertNull(loc2.right());
		assertNull(loc3.left());
		assertNull(loc3.right());
	}
	
	public void test24() {
		loc1 = tree.add("G");
		loc2 = tree.add("H");
		loc3 = tree.add("I");
		loc4 = tree.add("J");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertEquals(loc4, loc2.left());
		assertNull(loc2.right());
		assertNull(loc3.left());
		assertNull(loc3.right());
		assertNull(loc4.left());
		assertNull(loc4.right());
	}
	
	public void test25() {
		loc1 = tree.add("K");
		loc2 = tree.add("L");
		loc3 = tree.add("M");
		loc4 = tree.add("N");
		loc5 = tree.add("O");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertEquals(loc4, loc2.left());
		assertEquals(loc5, loc2.right());
		assertNull(loc3.left());
		assertNull(loc3.right());
		assertNull(loc4.left());
		assertNull(loc4.right());
		assertNull(loc5.left());
		assertNull(loc5.right());
	}
	
	public void test26() {
		loc1 = tree.add("P");
		loc2 = tree.add("Q");
		loc3 = tree.add("R");
		loc4 = tree.add("S");
		loc5 = tree.add("T");
		loc6 = tree.add("U");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertEquals(loc4, loc2.left());
		assertEquals(loc5, loc2.right());
		assertEquals(loc6, loc3.left());
		assertNull(loc3.right());
		assertNull(loc4.left());
		assertNull(loc4.right());
		assertNull(loc5.left());
		assertNull(loc5.right());
		assertNull(loc6.left());
		assertNull(loc6.right());
	}
	
	public void test27() {
		loc1 = tree.add("V");
		loc2 = tree.add("W");
		loc3 = tree.add("X");
		loc4 = tree.add("Y");
		loc5 = tree.add("Z");
		loc6 = tree.add("0");
		loc7 = tree.add("1");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertEquals(loc4, loc2.left());
		assertEquals(loc5, loc2.right());
		assertEquals(loc6, loc3.left());
		assertEquals(loc7, loc3.right());
		assertNull(loc4.left());
		assertNull(loc4.right());
		assertNull(loc5.left());
		assertNull(loc5.right());
		assertNull(loc6.left());
		assertNull(loc6.right());
		assertNull(loc7.left());
		assertNull(loc7.right());
	}

	public void test28() {
		loc1 = tree.add("2");
		loc2 = tree.add("3");
		loc3 = tree.add("4");
		loc4 = tree.add("5");
		loc5 = tree.add("6");
		loc6 = tree.add("7");
		loc7 = tree.add("8");
		loc8 = tree.add("9");
		
		assertEquals(loc2, loc1.left());
		assertEquals(loc3, loc1.right());
		assertEquals(loc4, loc2.left());
		assertEquals(loc5, loc2.right());
		assertEquals(loc6, loc3.left());
		assertEquals(loc7, loc3.right());
		assertEquals(loc8, loc4.left());
		assertNull(loc4.right());
		assertNull(loc5.left());
		assertNull(loc5.right());
		assertNull(loc6.left());
		assertNull(loc6.right());
		assertNull(loc7.left());
		assertNull(loc7.right());
		assertNull(loc8.left());
		assertNull(loc8.right());
	}

	
	/// test3x: test remove

	public void test31() {
		loc = tree.add("a");
		assertEquals("a", tree.remove());
		assertNull(tree.root());
		assertNull(tree.last());
	}
		
	public void test32() {
		loc1 = tree.add("b");
		loc2 = tree.add("c");
		assertEquals("c", tree.remove());
		assertNull(tree.root().left());
		
		assertEquals(loc1, tree.last());
	}
	
	public void test33() {
		loc1 = tree.add("d");
		loc2 = tree.add("e");
		loc3 = tree.add("f");
		
		assertEquals("f", tree.remove());
		assertEquals(loc2, loc1.left());
		assertNull(loc1.right());
		
		assertEquals(loc2, tree.last());
	}
	
	public void test34() {
		loc1 = tree.add("g");
		loc2 = tree.add("h");
		loc3 = tree.add("i");
		loc4 = tree.add("j");

		assertEquals("j", tree.remove());
		assertNull(loc3.left());
		assertEquals(loc3, loc1.right());
		
		assertEquals(loc3, tree.last());
	}

	public void test35() {
		loc1 = tree.add("k");
		loc2 = tree.add("l");
		loc3 = tree.add("m");
		loc4 = tree.add("n");
		loc5 = tree.add("o");
		
		assertEquals("o", tree.remove());
		assertEquals(loc4, loc2.left());
		assertNull(loc2. right());
		
		assertEquals(loc4, tree.last());
	}
	
	public void test36() {
		loc1 = tree.add("p");
		loc2 = tree.add("q");
		loc3 = tree.add("r");
		loc4 = tree.add("s");
		loc5 = tree.add("t");
		loc6 = tree.add("u");
		
		assertEquals("u", tree.remove());
		assertEquals(loc5, loc2.right());
		assertNull(loc3.left());
		
		assertEquals(loc5, tree.last());
	}
	
	public void test37() {
		loc1 = tree.add("v");
		loc2 = tree.add("w");
		loc3 = tree.add("x");
		loc4 = tree.add("y");
		loc5 = tree.add("z");
		loc6 = tree.add("0");
		loc7 = tree.add("1");
		
		assertEquals("1", tree.remove());
		assertEquals(loc6, loc3.left());
		assertNull(loc3.right());
		
		assertEquals(loc6, tree.last());
	}

	public void test38() {
		loc1 = tree.add("2");
		loc2 = tree.add("3");
		loc3 = tree.add("4");
		loc4 = tree.add("5");
		loc5 = tree.add("6");
		loc6 = tree.add("7");
		loc7 = tree.add("8");
		loc8 = tree.add("9");
		
		assertEquals("9", tree.remove());
		assertEquals(loc7, loc3.right());
		assertNull(loc4.left());
		
		assertEquals(loc7, tree.last());
	}

	public void test39() {
		root = tree.add("1");
		loc1 = tree.add("2");
		loc2 = tree.add("3");
		loc3 = tree.add("4");
		loc4 = tree.add("5");
		loc5 = tree.add("6");
		loc6 = tree.add("7");
		loc7 = tree.add("8");
		loc8 = tree.add("9");
		
		assertEquals("9", tree.remove());
		assertEquals("8", tree.remove());
		assertEquals("7", tree.remove());
		
		loc6 = tree.add("G");
		
		assertEquals(loc2, loc6.parent());
		assertEquals(loc6, loc2.right());
		
		assertEquals("G", tree.remove());
		assertEquals("6", tree.remove());
		assertEquals("5", tree.remove());
		
		loc4 = tree.add("E");
		
		assertEquals(loc1, loc4.parent());
		assertEquals(loc4, loc1.right());
		
		assertEquals("E", tree.remove());
		assertEquals("4", tree.remove());
		assertEquals("3", tree.remove());
		
		loc2 = tree.add("C");
		
		assertEquals(root, loc2.parent());
		assertEquals(loc2, root.right());
		
		assertEquals("C", tree.remove());
		assertEquals("2", tree.remove());
		assertEquals("1", tree.remove());
		
		assertTrue(tree.isEmpty());
	}
	
	
	/// test4x: testing set
	
	public void test41() {
		loc1 = tree.add("A");
		loc1.set("a");
		assertEquals("a", tree.root().get());
	}
	
	public void test42() {
		loc1 = tree.add("B");
		loc2 = tree.add("C");
		
		loc1.set("b");
		loc2.set("c");
		assertEquals("b", tree.root().get());
		assertEquals("c", tree.root().left().get());
	}
	
	public void test43() {
		loc1 = tree.add("D");
		loc2 = tree.add("E");
		loc3 = tree.add("F");
		
		loc1.set("d");
		loc2.set("e");
		loc3.set("f");
		
		assertEquals("d", loc3.parent().get());
		assertEquals("e", tree.root().left().get());
		assertEquals("f", tree.last().get());
	}
	
	
	public void test50() { // Piazza @819
		assertException(NoSuchElementException.class, () -> tree.remove());
	}
}
