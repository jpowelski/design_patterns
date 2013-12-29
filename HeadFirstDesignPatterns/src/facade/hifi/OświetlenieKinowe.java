package facade.hifi;

public class OświetlenieKinowe {

	public void włącz() {
		System.out.println("OświetlenieKinowe: włączone");
	}

	public void wyłącz() {
		System.out.println("OświetlenieKinowe: wyłączone");
	}

	public void ściemniaj(int wartość) {
		System.out.println("OświetlenieKinowe: ściemniaj: " + wartość + "%");
	}
}
