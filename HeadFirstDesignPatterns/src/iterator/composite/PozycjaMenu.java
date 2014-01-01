package iterator.composite;

public class PozycjaMenu extends MenuSkładnik {

	private String nazwa;
	private String opis;
	private boolean wegetariańska;
	private double cena;

	public PozycjaMenu(String nazwa, String opis, boolean wegetariańska,
			double cena) {
		super();
		this.nazwa = nazwa;
		this.opis = opis;
		this.wegetariańska = wegetariańska;
		this.cena = cena;
	}

	public String pobierzNazwa() {
		return nazwa;
	}

	public String pobierzOpis() {
		return opis;
	}

	public boolean jestWegetariańska() {
		return wegetariańska;
	}

	public double pobierzCena() {
		return cena;
	}

	public void drukuj() {
		System.out.print("   " + pobierzNazwa());
		if (jestWegetariańska()) {
			System.out.print("(w)");
		}

		System.out.println(", " + pobierzCena());
		System.out.println("\t-- " + pobierzOpis());
	}
}
