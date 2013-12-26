package strategy;

public abstract class Kaczka {

	ILatanie latanie;
	IKwakanie kwakanie;
	
	public abstract void wyœwietl();
	
	public void wykonajLot(){
		latanie.leæ();
	}
	
	public void wykonajKwacz(){
		kwakanie.kwacz();
	}
	
	public void p³ywaj(){
		System.out.println("Wszystkie kaczki p³ywaj¹, nawet te sztuczne!");
	}

	public void setLatanie(ILatanie latanie) {
		this.latanie = latanie;
	}

	public void setKwakanie(IKwakanie kwakanie) {
		this.kwakanie = kwakanie;
	}
}
