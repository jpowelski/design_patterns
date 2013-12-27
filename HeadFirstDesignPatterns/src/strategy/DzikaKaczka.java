package strategy;

public class DzikaKaczka extends Kaczka {

	
	public DzikaKaczka() {
		super();
		kwakanie = new Kwacz();
		latanie = new LatamBoMamSkrzydła();
	}

	@Override
	public void wyświetl() {
	System.out.println("Jestem prawdziwą dziką kaczką");

	}

}
