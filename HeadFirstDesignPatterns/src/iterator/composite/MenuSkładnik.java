package iterator.composite;

public abstract class MenuSkładnik {

	protected String nazwa;
	protected String opis;
	
	public MenuSkładnik(String nazwa, String opis) {
		this.nazwa = nazwa;
		this.opis = opis;
	}

	public String pobierzNazwa() {
		return nazwa;
	}

	public String pobierzOpis() {
		return opis;
	}

	public void dodaj(MenuSkładnik menuSkładnik) {
		throw new UnsupportedOperationException();
	}

	public void usuń(MenuSkładnik menuSkładnik) {
		throw new UnsupportedOperationException();
	}

	public MenuSkładnik pobierzPotomek(int i) {
		throw new UnsupportedOperationException();
	}

	public double pobierzCena() {
		throw new UnsupportedOperationException();
	}

	public boolean jestWegetariańska() {
		throw new UnsupportedOperationException();
	}

	public void drukuj() {
		throw new UnsupportedOperationException();
	}
}
