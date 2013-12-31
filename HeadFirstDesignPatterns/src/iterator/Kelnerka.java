package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Kelnerka {

	private ArrayList<Menu> menu;

	public Kelnerka(ArrayList<Menu> menu) {
		this.menu = menu;
	}

	public void drukujMenu() {
		for (Menu m : menu) {
			drukujMenu(m.utwórzIterator());
		}
	}

	private void drukujMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			PozycjaMenu pozycja = (PozycjaMenu) iterator.next();
			System.out.print(pozycja.getNazwa() + ", ");
			System.out.print(pozycja.getCena() + " -- ");
			System.out.println(pozycja.getOpis());
		}
	}

}
