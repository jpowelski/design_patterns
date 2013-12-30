package iterator;

public class Kelnerka {

	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;

	public Kelnerka(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void drukujMenu() {
		CustomIterator pancakeIterator = pancakeHouseMenu.utwórzIterator();
		CustomIterator dinerIterator = dinerMenu.utwórzIterator();

		System.out.println("MENU\n----\nŚNIADANIA");
		drukujMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		drukujMenu(dinerIterator);
	}

	private void drukujMenu(CustomIterator iterator) {
		while (iterator.hasNext()) {
			PozycjaMenu pozycja = (PozycjaMenu) iterator.next();
			System.out.print(pozycja.getNazwa() + ", ");
			System.out.print(pozycja.getCena() + " -- ");
			System.out.println(pozycja.getOpis());
		}
	}

}
