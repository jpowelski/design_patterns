package iterator.composite;

import java.util.Iterator;

public class PozycjaMenu extends MenuSkładnik {

	private boolean wegetariańska;
	private double cena;

	public PozycjaMenu(String nazwa, String opis, boolean wegetariańska,
			double cena) {
		super(nazwa, opis);
		this.wegetariańska = wegetariańska;
		this.cena = cena;
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

	@Override
	public Iterator<MenuSkładnik> utwórzIterator() {
		return new IteratorPusty();
	}
}
