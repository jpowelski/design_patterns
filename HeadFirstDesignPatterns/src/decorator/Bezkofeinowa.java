package decorator;

public class Bezkofeinowa extends Nap�j {

	public Bezkofeinowa(){
		opis = "Kawa bezkofeinowa";
	}
	
	@Override
	public double koszt() {
		return 1.05;
	}

}
