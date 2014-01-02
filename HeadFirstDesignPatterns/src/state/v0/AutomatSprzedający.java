package state.v0;

public class AutomatSprzedający {

	private final static int BRAK_GUM = 0;
	private final static int NIE_MA_MONETY = 1;
	private final static int JEST_MONETA = 2;
	private final static int GUMA_SPRZEDANA = 3;

	private int stan = BRAK_GUM;
	private int liczba = 0;

	public AutomatSprzedający(int liczba) {
		this.liczba = liczba;
		if (liczba > 0) {
			stan = NIE_MA_MONETY;
		}
	}

	public void włóżMonetę() {
		if (stan == BRAK_GUM) {
			System.out
					.println("Nie możesz włożyć monety, gdy automat jest pusty");
		} else if (stan == NIE_MA_MONETY) {
			stan = JEST_MONETA;
			System.out.println("Moneta przyjęta");
		} else if (stan == JEST_MONETA) {
			System.out.println("Nie możesz włożyć więcej niż jednej monety");
		} else if (stan == GUMA_SPRZEDANA) {
			System.out.println("Proszę czekać na gumę");
		}
	}

	public void zwróćMonetę() {
		if (stan == BRAK_GUM) {
			System.out.println("Nie włożyłeś monety");
		} else if (stan == NIE_MA_MONETY) {
			System.out.println("Nie włożyłeś monety");
		} else if (stan == JEST_MONETA) {
			System.out.println("Moneta zwrócona");
			stan = NIE_MA_MONETY;
		} else if (stan == GUMA_SPRZEDANA) {
			System.out
					.println("Niestety, nie można zwrócić monety po przekręceniu gałki");
		}
	}

	public void przekręćGałkę() {
		if (stan == BRAK_GUM) {
			System.out.println("Przekręciłeś gałkę, ale automat jest pusty");
		} else if (stan == NIE_MA_MONETY) {
			System.out.println("Zanim przekręcisz gałkę, wrzuć monetę");
		} else if (stan == JEST_MONETA) {
			System.out.println("Obróciłeś gałkę...");
			stan = GUMA_SPRZEDANA;
			wydaj();
		} else if (stan == GUMA_SPRZEDANA) {
			System.out
					.println("Nie dostaniesz gumy tylko dlatego, że przekręciłeś drugi raz");
		}
	}

	public void wydaj() {
		if (stan == BRAK_GUM) {
			System.out.println("Nie wydano gumy");
		} else if (stan == NIE_MA_MONETY) {
			System.out.println("Najpierw zapłać");
		} else if (stan == JEST_MONETA) {
			System.out.println("Nie wydano gumy");
		} else if (stan == GUMA_SPRZEDANA) {
			System.out.println("Wypada guma");
			liczba--;
			if (liczba == 0) {
				System.out.println("Ups, koniec gum!");
				stan = BRAK_GUM;
			} else {
				stan = NIE_MA_MONETY;
			}
		}
	}

	@Override
	public String toString() {
		String result = "\nAutomatSprzedający [zapas=" + liczba + "]\n";
		if (stan == BRAK_GUM) {
			result += "Automat jest pusty";
		} else if (stan == NIE_MA_MONETY) {
			result += "Automat oczekuje na monetę";
		} else if (stan == JEST_MONETA) {
			result += "Moneta w automacie";
		} else if (stan == GUMA_SPRZEDANA) {
			result += "Wydawanie gumy";
		}

		return result + "\n";
	}

}
