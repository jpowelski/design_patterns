package adapter.ducks;

public class TestowanieKaczki {

	public static void main(String[] args) {

		Kaczka kaczka = new DzikaKaczka();

		Indyk indyk = new DzikiIndyk();
		Kaczka indykAdapter = new IndykAdapter(indyk);

		System.out.println("Indyk:");
		indyk.gulgocz();
		indyk.lataj();

		System.out.println("\nKaczka:");
		testujKaczkę(kaczka);
		
		System.out.println("\nIndykAdapter:");
		testujKaczkę(indykAdapter);
	}

	private static void testujKaczkę(Kaczka kaczka) {
		kaczka.kwacz();
		kaczka.lataj();
	}
}
