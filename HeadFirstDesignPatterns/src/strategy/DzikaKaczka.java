package strategy;

public class DzikaKaczka extends Kaczka {

	
	public DzikaKaczka() {
		super();
		kwakanie = new Kwacz();
		latanie = new LatamBoMamSkrzyd�a();
	}

	@Override
	public void wy�wietl() {
	System.out.println("Jestem prawdziw� dzik� kaczk�");

	}

}
