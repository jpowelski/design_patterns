package facade.hifi;

public class Wzmacniacz {
	private Tuner tuner;
	private OdtwarzaczDVD odtwarzaczDVD;
	private OdtwarzaczCD odtwarzaczCD;

	public void włącz() {
		System.out.println("Wzmacniacz: włączony");
	}

	public void wyłącz() {
		System.out.println("Wzmacniacz: wyłączony");
	}

	public void ustawCD() {
		System.out.println("Wzmacniacz: CD ustawione");
	}

	public void ustawDVD() {
		System.out.println("Wzmacniacz: DVD ustawione");
	}

	public void ustawTuner() {
		System.out.println("Wzmacniacz: Tuner ustawiony");
	}
	
	public void ustawDźwiękStereo() {
		System.out.println("Wzmacniacz: Dźwięk stereo ustawiony");
	}
	
	public void ustawDźwiękPrzestrzenny() {
		System.out.println("Wzmacniacz: Dźwięk przestrzenny ustawiony");
	}
	
	public void ustawGłośność(int wartość) {
		System.out.println("Wzmacniacz: Głośność ustawiona: " + wartość);
	}
}
