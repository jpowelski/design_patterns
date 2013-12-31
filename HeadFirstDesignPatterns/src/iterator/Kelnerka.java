package iterator;

import java.util.Iterator;

public class Kelnerka {

	private Menu pancakeHouseMenu;
	private Menu dinerMenu;
	private UJackaMenu uJackaMenu;

	public Kelnerka(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, UJackaMenu uJackaMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.uJackaMenu = uJackaMenu;
	}

	public void drukujMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.utwórzIterator();
		Iterator dinerIterator = dinerMenu.utwórzIterator();
		Iterator uJackaIterator = uJackaMenu.utwórzIterator();

		System.out.println("MENU\n----\nŚNIADANIA");
		drukujMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		drukujMenu(dinerIterator);
		System.out.println("\nOBIADY");
		drukujMenu(uJackaIterator);
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
