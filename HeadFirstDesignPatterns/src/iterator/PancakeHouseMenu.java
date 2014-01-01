package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

	private ArrayList<PozycjaMenu> pozycjeMenu;

	public PancakeHouseMenu() {
		pozycjeMenu = new ArrayList<>();

		dodajElement("Śniadanie naleśnikowe K&B",
				"Naleśniki z jajecznicą i tostem", true, 2.99);

		dodajElement("Śniadanie naleśnikowe zwykłe",
				"Naleśniki z jajkiem sadzonym i kiełbasą", false, 2.99);

		dodajElement("Naleśniki z jagodami", "Naleśniki ze świeżymi jagodami",
				true, 3.49);

		dodajElement("Wafle nadziewane", "Wafle z jagodami lub truskawkami",
				true, 3.59);
	}

	private void dodajElement(String nazwa, String opis, boolean wegetariańska,
			double cena) {
		PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetariańska,
				cena);
		pozycjeMenu.add(pozycjaMenu);
	}

	public ArrayList<PozycjaMenu> pobierzPozycjeMenu() {
		return pozycjeMenu;
	}

	public Iterator utwórzIterator() {
		return pozycjeMenu.iterator();
	}
}
