package edu.uwm.cs351;

/**
 * An implementation of a binary complete tree.
 * Each location in the tree (node) can hold a value.
 * @param E type of the values held in the tree nodes.
 */
public interface CompleteTree<E> {
	/**
	 * Return the number of nodes in the tree.
	 * @return number of locations in tree
	 */
	public int size();
	
	/**
	 * Return true if the tree is empty.
	 * @return whether tree is empty
	 */
	public default boolean isEmpty() {
		return size() == 0;
	}
	
	/**
	 * Return the root of the complete tree, or
	 * null if the tree is empty.
	 * @return root of tree, if any
	 */
	public Location<E> root();
	
	/**
	 * Return the last node of the complete tree,
	 * or null if the tree is empty.
	 * @return last node in tree, if any
	 */
	public Location<E> last();
	
	/**
	 * Add a new node to the tree wit the given value
	 * and return the new last node.
	 * @param value initialize for the new node
	 * @return last node, never null
	 */
	public Location<E> add(E value);
	
	/**
	 * Remove the last node and return the value that
	 * had been at that location.
	 * @return value form the former last node.
	 * @Texception NoSuchElementException if the tree is empty
	 */
	public E remove();
	
	/**
	 * Nodes within the complete tree.
	 * each has a parent, up to two children 
	 * and a value
	 * @param T type of the values in the node
	 */
	public static interface Location<T> {
		/**
		 * Retrieve the value stored in the location
		 * @return value at this location in the binary tree
		 */
		public T get();
		
		/**
		 * Change the value in the location
		 * @param val new value
		 */
		public void set(T val);
		
		/**
		 * Return the parent location for this location,
		 * which will be null for the root
		 * @return
		 */
		public Location<T> parent();
		
		/**
		 * Return one of the two children of this location.
		 * Either could be null.
		 * @param right whether to return the right child
		 * @return child of this location
		 */
		public Location<T> child(boolean right);
		
		/**
		 * Return the left child of this location.
		 * The result may be null
		 * @return left child of this location.
		 */
		public default Location<T> left() { return child(false); }
		
		/**
		 * Return the right child of this location.
		 * The result may be null.
		 * @return right child of this location
		 */
		public default Location<T> right() { return child(true); }
	}
}
