package iterator;

public class PozycjaMenu {

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

	public String getNazwa() {
		return nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public boolean isWegetariańska() {
		return wegetariańska;
	}

	public double getCena() {
		return cena;
	}
}
