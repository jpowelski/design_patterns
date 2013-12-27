package strategy;

public class ModelKaczki extends Kaczka {

	public ModelKaczki(){
		latanie = new NieLatam();
		kwakanie = new Kwacz();
	}
	
	@Override
	public void wyświetl() {
System.out.println("Jestem modelem kaczki");
	}

}
