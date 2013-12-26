package factory;

import java.util.ArrayList;

public abstract class Pizza {

	protected String nazwa;
	protected String ciasto;
	protected String sos;
	protected ArrayList<String> dodatki = new ArrayList<>();
	
	void przygotowanie() {
		System.out.println("Przygotowywanie: " + nazwa);
		System.out.println("Wyrabianie ciasta...");
		System.out.println("Dodawanie sosu...");
		System.out.println("Dodatki: ");
		for(int i=0;i<dodatki.size();i++){
			System.out.println("   " + dodatki.get(i));
		}
	}
	
	void pieczenie() {
		System.out.println("Pieczenie: 25 minut w temp. 250 stopni C");
	}
	
	void krojenie() {
		System.out.println("Krojenie pizzy na 8 kawa³ków");
	}
	
	void pakowanie() {
		System.out.println("Pakowanie pizzy w oficjalne pude³ko");
	}
	
	public String pobierzNazwa() {
		return nazwa;
	}
}
