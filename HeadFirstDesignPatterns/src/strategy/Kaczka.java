package strategy;

public abstract class Kaczka {

	ILatanie latanie;
	IKwakanie kwakanie;
	
	public abstract void wy�wietl();
	
	public void wykonajLot(){
		latanie.le�();
	}
	
	public void wykonajKwacz(){
		kwakanie.kwacz();
	}
	
	public void p�ywaj(){
		System.out.println("Wszystkie kaczki p�ywaj�, nawet te sztuczne!");
	}

	public void setLatanie(ILatanie latanie) {
		this.latanie = latanie;
	}

	public void setKwakanie(IKwakanie kwakanie) {
		this.kwakanie = kwakanie;
	}
}
