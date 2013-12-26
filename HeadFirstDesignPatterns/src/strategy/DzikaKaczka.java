package strategy;

public class DzikaKaczka extends Kaczka {

	
	public DzikaKaczka() {
		super();
		kwakanie = new Kwacz();
		latanie = new LatamBoMamSkrzyd³a();
	}

	@Override
	public void wyœwietl() {
	System.out.println("Jestem prawdziw¹ dzik¹ kaczk¹");

	}

}
