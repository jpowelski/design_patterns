package iterator;

import java.util.Iterator;

public class Kelnerka {

	private Menu pancakeHouseMenu;
	private Menu dinerMenu;

	public Kelnerka(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void drukujMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.utwórzIterator();
		Iterator dinerIterator = dinerMenu.utwórzIterator();

		System.out.println("MENU\n----\nŚNIADANIA");
		drukujMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		drukujMenu(dinerIterator);
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
