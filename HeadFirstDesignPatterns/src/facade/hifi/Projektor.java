package facade.hifi;

public class Projektor {

	private OdtwarzaczDVD odtwarzaczDVD;
	
	public void włącz() {
		System.out.println("Projektor: włączony");
	}

	public void wyłącz() {
		System.out.println("Projektor: wyłączony");
	}
	
	public void trybTV() {
		System.out.println("Projektor: trybTV");
	}
	
	public void trybSzerokoekranowy() {
		System.out.println("Projektor: tryb szerokoekranowy");
	}

}
