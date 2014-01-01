package iterator.composite;

public class MenuTest {

	public static void main(String[] args) {

		MenuSkładnik pancakeHouseMenu = new Menu("MENU PANCAKE HOUSE",
				"Śniadania");
		MenuSkładnik dinerMenu = new Menu("MENU RESTAURACJI DINER", "Lunch");
		MenuSkładnik uJackaMenu = new Menu("MENU U JACKA", "Obiady");
		MenuSkładnik deseryMenu = new Menu("MENU DESERÓW",
				"Desery, oczywiście :)");

		MenuSkładnik menu = new Menu("PEŁNE MENU", "Połączone menu");
		menu.dodaj(pancakeHouseMenu);
		menu.dodaj(dinerMenu);
		menu.dodaj(uJackaMenu);

		pancakeHouseMenu.dodaj(new PozycjaMenu("Śniadanie naleśnikowe K&B",
				"Naleśniki z jajecznicą i tostem", true, 2.99));
		pancakeHouseMenu.dodaj(new PozycjaMenu("Śniadanie naleśnikowe zwykłe",
				"Naleśniki z jajkiem sadzonym i kiełbasą", false, 2.99));
		pancakeHouseMenu.dodaj(new PozycjaMenu("Naleśniki z jagodami",
				"Naleśniki ze świeżymi jagodami", true, 3.49));
		pancakeHouseMenu.dodaj(new PozycjaMenu("Wafle nadziewane",
				"Wafle z jagodami lub truskawkami", true, 3.59));

		dinerMenu.dodaj(new PozycjaMenu("Wegetariańska Kanapka",
				"Sałata + pomidor", true, 2.99));
		dinerMenu.dodaj(new PozycjaMenu("Kanapka BSP",
				"Boczek z sałatą + chleb pszenny", false, 2.99));
		dinerMenu.dodaj(new PozycjaMenu("Zupa dnia", "pomidorowa z boczkiem",
				false, 3.29));
		dinerMenu.dodaj(new PozycjaMenu("Danie dnia", "Schabowy + ziemniaki",
				false, 3.09));

		dinerMenu.dodaj(deseryMenu);

		deseryMenu.dodaj(new PozycjaMenu("Szarlotka",
				"Szarlotka z lodami waniliowymi", true, 1.59));

		uJackaMenu.dodaj(new PozycjaMenu("Kanapka wegetariańska z frytkami",
				"Kanapka wegetariańska z sałatą i pomidorem, frytki", true,
				3.99));
		uJackaMenu.dodaj(new PozycjaMenu("Zupa dnia",
				"Filiżanka zupy dnia, sałatka", false, 3.69));
		uJackaMenu
				.dodaj(new PozycjaMenu(
						"Burito",
						"Duże burito z łaciatą fasolą, sosem salsa i guacamole(awokado)",
						true, 4.29));

		Kelnerka kelnerka = new Kelnerka(menu);
		kelnerka.drukujMenu();
	}
}
