package iterator.composite;

import java.util.Iterator;

public class Kelnerka {

	private MenuSkładnik menu;

	public Kelnerka(MenuSkładnik menu) {
		this.menu = menu;
	}

	public void drukujMenu() {
		menu.drukuj();
	}

	public void drukujMenuWegetariańskie() {
		Iterator<MenuSkładnik> iterator = menu.utwórzIterator();

		System.out.println("\nMENU WEGETARIAŃSKIE\n----");
		while (iterator.hasNext()) {
			MenuSkładnik m = iterator.next();
			try {
				if (m.jestWegetariańska()) {
					m.drukuj();
				}
			} catch (UnsupportedOperationException e) {
			}
		}
	}

}
