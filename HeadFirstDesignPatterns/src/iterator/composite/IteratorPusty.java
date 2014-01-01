package iterator.composite;

import java.util.Iterator;

public class IteratorPusty implements Iterator<MenuSkładnik> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuSkładnik next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
