package complex.ducks;

public class WabikKaczka implements Kwacząca {

Obserwowany obserwowany;
	
	public WabikKaczka(){
		obserwowany = new Obserwowany(this);
	}
	
	@Override
	public void kwacz() {
		System.out.println("Kwak");
		powiadomObserwatorów();
	}

	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		obserwowany.zarejestrujObserwatora(obserwator);
	}

	@Override
	public void powiadomObserwatorów() {
		obserwowany.powiadomObserwatorów();
	}
	
}
