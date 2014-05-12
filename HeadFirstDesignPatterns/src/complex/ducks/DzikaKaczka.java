package complex.ducks;

public class DzikaKaczka implements Kwacząca {

	Obserwowany obserwowany;
	
	public DzikaKaczka(){
		obserwowany = new Obserwowany(this);
	}
	
	@Override
	public void kwacz() {
		System.out.println("Kwa! Kwa!");
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
