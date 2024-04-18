import edu.uwm.cs351.MinHeap;

import edu.uwm.cs351.TreeCompleteTree;

import junit.framework.TestCase;

/** Test the min-heap with descending integers. 
 * It is really a max-heap.
 */
public class TestExhaustive extends TestCase {
	private MinHeap<Integer> h;
	@Override
	protected void setUp() {
		h = new MinHeap<>(new TreeCompleteTree<Integer>(), (i1,i2) -> i2-i1);
	}

	public void test1001() {
		h.add(1);
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test2001() {
		h.add(2);
		h.add(1);
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test2002() {
		h.add(1);
		h.add(2);
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3001() {
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3002() {
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3003() {
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3004() {
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3005() {
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test3006() {
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4001() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4002() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4003() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4004() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4005() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4006() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4007() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4008() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4009() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4010() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4011() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4012() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4013() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4014() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4015() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4016() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4017() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4018() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4019() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4020() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4021() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4022() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4023() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test4024() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5001() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5002() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5003() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5004() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5005() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5006() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5007() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5008() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5009() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5010() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5011() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5012() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5013() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5014() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5015() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5016() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5017() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5018() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5019() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5020() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5021() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5022() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5023() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5024() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5025() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5026() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5027() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5028() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5029() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5030() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5031() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5032() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5033() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5034() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5035() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5036() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5037() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5038() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5039() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5040() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5041() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5042() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5043() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5044() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5045() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5046() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5047() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5048() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5049() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5050() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5051() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5052() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5053() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5054() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5055() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5056() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5057() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5058() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5059() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5060() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5061() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5062() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5063() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5064() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5065() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5066() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5067() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5068() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5069() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5070() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5071() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5072() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5073() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5074() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5075() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5076() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5077() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5078() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5079() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5080() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5081() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5082() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5083() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5084() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5085() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5086() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5087() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5088() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5089() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5090() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5091() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5092() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5093() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5094() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5095() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5096() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5097() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5098() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5099() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5100() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5101() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5102() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5103() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5104() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5105() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5106() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5107() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5108() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5109() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5110() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5111() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5112() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5113() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5114() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5115() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5116() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5117() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5118() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5119() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test5120() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6001() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6002() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6003() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6004() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6005() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6006() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6007() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6008() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6009() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6010() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6011() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6012() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6013() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6014() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6015() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6016() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6017() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6018() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6019() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6020() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6021() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6022() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6023() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6024() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6025() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6026() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6027() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6028() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6029() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6030() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6031() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6032() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6033() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6034() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6035() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6036() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6037() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6038() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6039() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6040() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6041() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6042() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6043() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6044() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6045() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6046() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6047() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6048() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6049() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6050() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6051() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6052() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6053() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6054() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6055() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6056() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6057() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6058() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6059() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6060() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6061() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6062() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6063() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6064() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6065() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6066() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6067() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6068() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6069() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6070() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6071() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6072() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6073() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6074() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6075() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6076() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6077() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6078() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6079() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6080() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6081() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6082() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6083() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6084() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6085() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6086() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6087() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6088() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6089() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6090() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6091() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6092() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6093() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6094() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6095() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6096() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6097() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6098() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6099() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6100() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6101() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6102() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6103() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6104() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6105() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6106() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6107() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6108() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6109() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6110() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6111() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6112() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6113() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6114() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6115() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6116() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6117() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6118() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6119() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6120() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6121() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6122() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6123() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6124() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6125() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6126() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6127() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6128() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6129() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6130() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6131() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6132() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6133() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6134() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6135() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6136() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6137() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6138() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6139() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6140() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6141() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6142() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6143() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6144() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6145() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6146() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6147() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6148() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6149() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6150() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6151() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6152() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6153() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6154() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6155() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6156() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6157() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6158() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6159() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6160() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6161() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6162() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6163() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6164() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6165() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6166() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6167() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6168() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6169() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6170() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6171() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6172() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6173() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6174() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6175() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6176() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6177() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6178() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6179() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6180() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6181() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6182() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6183() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6184() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6185() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6186() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6187() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6188() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6189() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6190() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6191() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6192() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6193() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6194() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6195() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6196() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6197() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6198() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6199() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6200() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6201() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6202() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6203() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6204() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6205() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6206() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6207() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6208() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6209() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6210() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6211() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6212() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6213() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6214() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6215() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6216() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6217() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6218() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6219() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6220() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6221() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6222() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6223() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6224() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6225() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6226() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6227() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6228() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6229() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6230() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6231() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6232() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6233() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6234() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6235() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6236() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6237() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6238() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6239() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6240() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6241() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6242() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6243() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6244() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6245() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6246() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6247() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6248() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6249() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6250() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6251() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6252() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6253() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6254() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6255() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6256() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6257() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6258() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6259() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6260() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6261() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6262() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6263() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6264() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6265() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6266() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6267() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6268() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6269() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6270() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6271() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6272() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6273() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6274() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6275() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6276() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6277() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6278() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6279() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6280() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6281() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6282() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6283() {
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6284() {
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6285() {
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6286() {
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6287() {
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6288() {
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6289() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6290() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6291() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6292() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6293() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6294() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6295() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6296() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6297() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6298() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6299() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6300() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6301() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6302() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6303() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6304() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6305() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6306() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6307() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6308() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6309() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6310() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6311() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6312() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6313() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6314() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6315() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6316() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6317() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6318() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6319() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6320() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6321() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6322() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6323() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6324() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6325() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6326() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6327() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6328() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6329() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6330() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6331() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6332() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6333() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6334() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6335() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6336() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6337() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6338() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6339() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6340() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6341() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6342() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6343() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6344() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6345() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6346() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6347() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6348() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6349() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6350() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6351() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6352() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6353() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6354() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6355() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6356() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6357() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6358() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6359() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6360() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		h.add(5);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6361() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6362() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6363() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6364() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6365() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6366() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6367() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6368() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6369() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6370() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6371() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6372() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6373() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6374() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6375() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6376() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6377() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6378() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6379() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6380() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6381() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6382() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6383() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6384() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6385() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6386() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6387() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6388() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6389() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6390() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6391() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6392() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6393() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6394() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6395() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6396() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6397() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6398() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6399() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6400() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6401() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6402() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6403() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6404() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6405() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6406() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6407() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6408() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6409() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6410() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6411() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6412() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6413() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6414() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6415() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6416() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6417() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6418() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6419() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6420() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6421() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6422() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6423() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6424() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6425() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6426() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6427() {
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6428() {
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6429() {
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6430() {
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6431() {
		h.add(1);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6432() {
		h.add(3);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6433() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6434() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6435() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6436() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6437() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6438() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6439() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6440() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6441() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6442() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6443() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6444() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6445() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6446() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6447() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6448() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6449() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6450() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6451() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6452() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6453() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6454() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6455() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6456() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6457() {
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6458() {
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6459() {
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6460() {
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6461() {
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6462() {
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6463() {
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6464() {
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6465() {
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6466() {
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6467() {
		h.add(6);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6468() {
		h.add(3);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6469() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6470() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6471() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6472() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6473() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6474() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6475() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6476() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6477() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6478() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6479() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6480() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6481() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6482() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6483() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6484() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6485() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6486() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6487() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6488() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6489() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6490() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6491() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6492() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6493() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6494() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6495() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6496() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6497() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6498() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6499() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6500() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6501() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6502() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6503() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6504() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6505() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6506() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6507() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6508() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6509() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6510() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6511() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6512() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6513() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6514() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6515() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6516() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6517() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6518() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6519() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6520() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6521() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6522() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6523() {
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6524() {
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6525() {
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6526() {
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6527() {
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6528() {
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6529() {
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6530() {
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6531() {
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6532() {
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6533() {
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6534() {
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6535() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6536() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6537() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6538() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6539() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6540() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6541() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6542() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6543() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6544() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6545() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6546() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6547() {
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6548() {
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6549() {
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6550() {
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6551() {
		h.add(6);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6552() {
		h.add(4);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6553() {
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6554() {
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6555() {
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6556() {
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6557() {
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6558() {
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6559() {
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6560() {
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6561() {
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6562() {
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6563() {
		h.add(6);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6564() {
		h.add(5);
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6565() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6566() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6567() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6568() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6569() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6570() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6571() {
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6572() {
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6573() {
		h.add(6);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6574() {
		h.add(2);
		h.add(6);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6575() {
		h.add(1);
		h.add(6);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6576() {
		h.add(6);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6577() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6578() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6579() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6580() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6581() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6582() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6583() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6584() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6585() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6586() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6587() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6588() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6589() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6590() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6591() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6592() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6593() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6594() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6595() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6596() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6597() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6598() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6599() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6600() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		h.add(3);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6601() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6602() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6603() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6604() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6605() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6606() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6607() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6608() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6609() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6610() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6611() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6612() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6613() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6614() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6615() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6616() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6617() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6618() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6619() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6620() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6621() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6622() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6623() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6624() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6625() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6626() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6627() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6628() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6629() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6630() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6631() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6632() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6633() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6634() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6635() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6636() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6637() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6638() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6639() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6640() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6641() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6642() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6643() {
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6644() {
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6645() {
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6646() {
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6647() {
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6648() {
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6649() {
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6650() {
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6651() {
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6652() {
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6653() {
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6654() {
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6655() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6656() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6657() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6658() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6659() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6660() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6661() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6662() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6663() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6664() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6665() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6666() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6667() {
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6668() {
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6669() {
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6670() {
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6671() {
		h.add(1);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6672() {
		h.add(4);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6673() {
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6674() {
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6675() {
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6676() {
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6677() {
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6678() {
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6679() {
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6680() {
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6681() {
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6682() {
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6683() {
		h.add(1);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6684() {
		h.add(5);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6685() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6686() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6687() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6688() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6689() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6690() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6691() {
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6692() {
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6693() {
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6694() {
		h.add(2);
		h.add(1);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6695() {
		h.add(3);
		h.add(1);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6696() {
		h.add(1);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6697() {
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6698() {
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6699() {
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6700() {
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6701() {
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6702() {
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6703() {
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6704() {
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6705() {
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6706() {
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6707() {
		h.add(3);
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6708() {
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6709() {
		h.add(4);
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6710() {
		h.add(2);
		h.add(4);
		h.add(5);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6711() {
		h.add(5);
		h.add(4);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6712() {
		h.add(4);
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6713() {
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6714() {
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(3);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6715() {
		h.add(5);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6716() {
		h.add(2);
		h.add(5);
		h.add(3);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6717() {
		h.add(3);
		h.add(5);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6718() {
		h.add(5);
		h.add(3);
		h.add(2);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6719() {
		h.add(2);
		h.add(3);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

	public void test6720() {
		h.add(3);
		h.add(2);
		h.add(5);
		h.add(4);
		h.add(1);
		h.add(6);
		assertSame(6,h.removeMin());
		assertSame(5,h.removeMin());
		assertSame(4,h.removeMin());
		assertSame(3,h.removeMin());
		assertSame(2,h.removeMin());
		assertSame(1,h.removeMin());
		assertEquals(0,h.size());
}

}
