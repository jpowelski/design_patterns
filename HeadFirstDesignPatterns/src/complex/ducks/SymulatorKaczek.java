package complex.ducks;

public class SymulatorKaczek {
	public static void main(String[] args) {
		SymulatorKaczek symulator = new SymulatorKaczek();
		AbstrakcyjnaFabrykaKaczek kaczkaFabryka = new FabrykaKaczekZLicznikiem();
		symulator.uruchom(kaczkaFabryka);
	}

	private void uruchom(AbstrakcyjnaFabrykaKaczek kaczkaFabryka) {
		Kwacząca płaskonosKaczka = kaczkaFabryka.utwórzPłaskonosKaczka();
		Kwacząca wabikKaczka = kaczkaFabryka.utwórzWabikKaczka();
		Kwacząca gumowaKaczka = kaczkaFabryka.utwórzGumowaKaczka();
		Kwacząca gęśKaczka = new GęśAdapter(new Gęś());
		System.out.println("\nSymulator kaczek: ze wzrocem Kompozyt - stada");
		
		Stado stadoKaczek = new Stado();
		
		stadoKaczek.dodaj(płaskonosKaczka);
		stadoKaczek.dodaj(wabikKaczka);
		stadoKaczek.dodaj(gumowaKaczka);
		stadoKaczek.dodaj(gęśKaczka);
		
		Stado stadoDzikichKaczek = new Stado();
		
		Kwacząca dzikaKaczka1 = kaczkaFabryka.utwórzDzikaKaczka();
		Kwacząca dzikaKaczka2 = kaczkaFabryka.utwórzDzikaKaczka();
		Kwacząca dzikaKaczka3 = kaczkaFabryka.utwórzDzikaKaczka();
		Kwacząca dzikaKaczka4 = kaczkaFabryka.utwórzDzikaKaczka();

		stadoDzikichKaczek.dodaj(dzikaKaczka1);
		stadoDzikichKaczek.dodaj(dzikaKaczka2);
		stadoDzikichKaczek.dodaj(dzikaKaczka3);
		stadoDzikichKaczek.dodaj(dzikaKaczka4);
		
		stadoKaczek.dodaj(stadoDzikichKaczek);
		
		System.out.println("\nSymulator kaczek: z wzorcem Obserwator");
		
		Kwakolog kwakolog = new Kwakolog();
		stadoKaczek.zarejestrujObserwatora(kwakolog);
		
		System.out.println("\nSymulator kaczek: Symulacja całego stada");
		uruchom(stadoKaczek);
		
		System.out.println("\nSymulator kaczek: Symulacja stada dzikich kaczek");
		uruchom(stadoDzikichKaczek);
		

		System.out.println("Kaczki kwaknęły "
				+ KwakLicznik.pobierzLiczbęKwaknięć() + " razy");
	}

	private void uruchom(Kwacząca kaczka) {
		kaczka.kwacz();
	}
}
