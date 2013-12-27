package decorator;

public class Espresso extends Napój {

	public Espresso() {
		opis = "Kawa Espresso";
	}

	@Override
	public double koszt() {
		return 1.99;
	}

}
