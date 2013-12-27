package decorator;

public class Bezkofeinowa extends Napój {

	public Bezkofeinowa(){
		opis = "Kawa bezkofeinowa";
	}
	
	@Override
	public double koszt() {
		return 1.05;
	}

}
