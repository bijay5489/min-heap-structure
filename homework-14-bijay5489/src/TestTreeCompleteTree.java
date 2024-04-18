import edu.uwm.cs351.CompleteTree;
import edu.uwm.cs351.TreeCompleteTree;

public class TestTreeCompleteTree extends AbstractTestCompleteTree {

	@Override
	protected void initialize() {
		tree = new TreeCompleteTree<>();
	}

	
	protected CompleteTree.Location<String> execute(String path) {
		CompleteTree.Location<String> l = tree.root();
		for (int i=0; i < path.length(); ++i) {
			switch (path.charAt(i)) {
			case 'L': l = l.left(); break;
			case 'R': l = l.right(); break;
			default:
			}
		}
		return l;
	}
	
	/// Locked Test
	
	public void test() {
		// Follow the idea from the activity to convert a number to
		// a path to the node for this index.
		// Review:   (example for 13)
		// 1. Convert to binary (e.g., 1101)  
		// 2. remove leading one (e.g. 101)
		// 3. replace 0 with L and 1 with R (e.g. RLR)
		for (int i=1; i <= 100; ++i) { tree.add(""+i); }
		assertEquals("13", execute("RLR").get());
		assertEquals("14", execute(Ts(434124026)).get());
		assertEquals("16", execute(Ts(1861555772)).get());
		assertEquals("23", execute(Ts(1441308952)).get());
		assertEquals("33", execute(Ts(533066426)).get());
		assertEquals("45", execute(Ts(420329487)).get());
	}
}
