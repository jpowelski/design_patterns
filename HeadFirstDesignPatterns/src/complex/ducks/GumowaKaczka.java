package complex.ducks;

public class GumowaKaczka implements Kwacząca {

Obserwowany obserwowany;
	
	public GumowaKaczka(){
		obserwowany = new Obserwowany(this);
	}
	
	@Override
	public void kwacz() {
		System.out.println("Piszczę!");
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
