package facade.hifi;

public class OdtwarzaczDVD {

	private Wzmacniacz wzmacniacz;
	private String film;

	public void włącz() {
		System.out.println("OdtwarzaczDVD: włączony");
	}

	public void wyłącz() {
		System.out.println("OdtwarzaczDVD: wyłączony");
	}

	public void wysuńDysk() {
		System.out.println("OdtwarzaczDVD: dysk wysunięty");
	}

	public void pauza() {
		System.out.println("OdtwarzaczDVD: pauza");
	}

	public void odtwarzaj(String film) {
		this.film = film;
		System.out.println("OdtwarzaczDVD: odtwarzanie filmu: " + film);
	}

	public void ustawPrzestrzennyEfektAudio() {
		System.out.println("OdtwarzaczDVD: Przestrzenny efekt audio ustawiony");
	}

	public void ustawDwukanałoweAudio() {
		System.out.println("OdtwarzaczDVD: Dwukanałowe audio ustawione");
	}

	public void zatrzymaj() {
		System.out.println("OdtwarzaczDVD: koniec odtwarzania filmu: " + film);
	}

}
