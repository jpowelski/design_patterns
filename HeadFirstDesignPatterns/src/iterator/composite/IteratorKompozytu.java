package iterator.composite;

import java.util.Iterator;
import java.util.Stack;

public class IteratorKompozytu implements Iterator<MenuSkładnik> {

	private Stack<Iterator<MenuSkładnik>> stos = new Stack<>();

	public IteratorKompozytu(Iterator<MenuSkładnik> iterator) {
		stos.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stos.empty()) {
			return false;
		}
		Iterator<MenuSkładnik> iterator = stos.peek();
		if (!iterator.hasNext()) {
			stos.pop();
			return hasNext();
		}
		return true;
	}

	@Override
	public MenuSkładnik next() {
		if (hasNext()) {
			Iterator<MenuSkładnik> iterator = stos.peek();
			MenuSkładnik menuSkładnik = iterator.next();
			if (menuSkładnik instanceof Menu) {
				stos.push(menuSkładnik.utwórzIterator());
			}
			return menuSkładnik;
		}

		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
