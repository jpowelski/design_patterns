package strategy;

public abstract class Kaczka {

	ILatanie latanie;
	IKwakanie kwakanie;
	
	public abstract void wyświetl();
	
	public void wykonajLot(){
		latanie.leć();
	}
	
	public void wykonajKwacz(){
		kwakanie.kwacz();
	}
	
	public void pływaj(){
		System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
	}

	public void setLatanie(ILatanie latanie) {
		this.latanie = latanie;
	}

	public void setKwakanie(IKwakanie kwakanie) {
		this.kwakanie = kwakanie;
	}
}
