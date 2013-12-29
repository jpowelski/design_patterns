package facade.hifi;

public class OdtwarzaczCD {
	private Wzmacniacz wzmacniacz;

	public void włącz() {
		System.out.println("OdtwarzaczCD: włączony");
	}

	public void wyłącz() {
		System.out.println("OdtwarzaczCD: wyłączony");
	}

	public void wysuńDysk() {
		System.out.println("OdtwarzaczCD: dysk wysunięty");
	}

	public void pauza() {
		System.out.println("OdtwarzaczCD: pauza");
	}

	public void odtwarzaj() {
		System.out.println("OdtwarzaczCD: odtwarzaj");
	}

	public void zatrzymaj() {
		System.out.println("OdtwarzaczCD: zatrzymaj");
	}
}
