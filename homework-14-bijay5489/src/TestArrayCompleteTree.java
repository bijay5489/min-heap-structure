import edu.uwm.cs351.ArrayCompleteTree;

public class TestArrayCompleteTree extends AbstractTestCompleteTree {

	@Override
	protected void initialize() {
		tree = new ArrayCompleteTree<>();
	}

	/// Locked test
	
	public void test() {
		// arrays use zero-based indexing, but we will use
		// one-based indexing for our locations.
		for (int i=1; i <= 100; ++i) { tree.add(""+i); } // 100 locations
		loc = tree.root().left().right().right().left().right();
		assertEquals("Location(45)", "" + loc);
		assertEquals(Ts(374165115), "" + loc.parent());
		assertEquals(Ts(944299071), "" + loc.left());
		assertEquals(Ts(1690489547), "" + loc.right());
		assertEquals(Ts(563854870), "" + loc.parent().parent());
		assertEquals(Ts(2120613260), "" + loc.left().left());
	}
}
