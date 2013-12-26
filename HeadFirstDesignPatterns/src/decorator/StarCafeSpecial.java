package decorator;

public class StarCafeSpecial extends Napój {

	public StarCafeSpecial(){
		opis = "Kawa Star Cafe Special";
	}
	
	@Override
	public double koszt() {
		return 0.89;
	}

}
