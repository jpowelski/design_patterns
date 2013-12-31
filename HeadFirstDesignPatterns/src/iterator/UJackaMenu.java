package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class UJackaMenu implements Menu{

	private Hashtable<String, PozycjaMenu> pozycjeMenu = new Hashtable<>();

	public UJackaMenu() {
		dodajElement("Kanapka wegetariańska z frytkami",
				"Kanapka wegetariańska z sałatą i pomidorem, frytki", true,
				3.99);
		dodajElement("Zupa dnia", "Filiżanka zupy dnia, sałatka", false, 3.69);
		dodajElement(
				"Burito",
				"Duże burito z łaciatą fasolą, sosem salsa i guacamole(awokado)",
				true, 4.29);
	}

	private void dodajElement(String nazwa, String opis, boolean wegetariańska,
			double cena) {
		PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetariańska,
				cena);
		pozycjeMenu.put(pozycjaMenu.getNazwa(), pozycjaMenu);
	}

	@Override
	public Iterator utwórzIterator() {
		return pozycjeMenu.values().iterator();
	}
}
