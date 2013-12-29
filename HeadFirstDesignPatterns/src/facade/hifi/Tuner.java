package facade.hifi;

public class Tuner {

	private Wzmacniacz wzmacniacz;
	
	public void włącz() {
		System.out.println("Tuner: włączony");
	}

	public void wyłącz() {
		System.out.println("Tuner: wyłączony");
	}

	public void ustawZakresAM() {
		System.out.println("Tuner: Zakres AM ustawiony");
	}

	public void ustawZakresFM() {
		System.out.println("Tuner: Zakres FM ustawiony");
	}

	public void ustawCzęstotliwość() {
		System.out.println("Tuner: Częstotliwość ustawiona");
	}
}
