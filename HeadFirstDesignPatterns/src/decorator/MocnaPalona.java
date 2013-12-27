package decorator;

public class MocnaPalona extends Napój {

	public MocnaPalona(){
		opis = "Kawa Mocna Palona";
	}
	
	@Override
	public double koszt() {
		return 0.99;
	}

}
