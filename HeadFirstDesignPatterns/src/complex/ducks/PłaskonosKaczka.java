package complex.ducks;

public class PłaskonosKaczka implements Kwacząca {

Obserwowany obserwowany;
	
	public PłaskonosKaczka(){
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
