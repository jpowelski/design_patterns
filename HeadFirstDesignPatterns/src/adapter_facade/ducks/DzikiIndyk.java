package adapter_facade.ducks;

public class DzikiIndyk implements Indyk {

	@Override
	public void gulgocz() {
		System.out.println("Gulgulgul");
	}

	@Override
	public void lataj() {
		System.out.println("O rany, latam... ale tylko na krotkich dystansach");
	}

}
