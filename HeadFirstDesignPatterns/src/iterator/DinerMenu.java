package iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{

	private final static int MAKS_LICZBA_ELEMENTÓW = 6;
	int liczbaElementów = 0;
	PozycjaMenu[] pozycjeMenu;
	
	public DinerMenu(){
		pozycjeMenu = new PozycjaMenu[MAKS_LICZBA_ELEMENTÓW];
		

		dodajElement("Wegetariańska Kanapka", "Sałata + pomidor", true, 2.99);
		dodajElement("Kanapka BSP", "Boczek z sałatą + chleb pszenny", false, 2.99);
		dodajElement("Zupa dnia", "pomidorowa z boczkiem", false, 3.29);
		dodajElement("Danie dnia", "Schabowy + ziemniaki", false, 3.09);
	}
	
	private void dodajElement(String nazwa, String opis, boolean wegetariańska,
			double cena) {
		PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetariańska,
				cena);
		if (liczbaElementów >= MAKS_LICZBA_ELEMENTÓW){
			System.err.println("Menu jest pełne! Nie można dodać nowej pozycji!");
		} else{
			pozycjeMenu[liczbaElementów] = pozycjaMenu;
			liczbaElementów++;
		}
	}
	
	public Iterator utwórzIterator(){
		return new DinerMenuIterator(pozycjeMenu);
	}
}
