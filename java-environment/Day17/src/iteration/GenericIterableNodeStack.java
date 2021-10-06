package iteration;

import java.util.Iterator;
import generics.GenericNode;

/*
 * This is an altered version of our BasicIterableNodeStack class.
 * This version simply adds Generics
 */
public class GenericIterableNodeStack<T> implements Iterable<GenericNode<T>> {
	private GenericNode<T> top;

	private GenericNode<T> cursor;

	public void push(T element) {
		GenericNode<T> node = new GenericNode<T>(element);
		push(node);
	}

	public void push(GenericNode<T> node) {
		node.setNext(top);
		this.top = (node);
		this.cursor = top;
	}

	public GenericNode<T> pop() {
		GenericNode<T> poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public GenericNode<T> peek() {
		return top;
	}

	@Override
	public Iterator<GenericNode<T>> iterator() {
		return new NodeIterator();
	}

	private class NodeIterator implements Iterator<GenericNode<T>> {
		NodeIterator() {
			cursor = top;
		}

		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;

			return false;
		}

		@Override
		public GenericNode<T> next() {
			GenericNode<T> ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();

			return ret;
		}
	}
}
