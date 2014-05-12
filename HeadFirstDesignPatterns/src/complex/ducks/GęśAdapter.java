package complex.ducks;

public class GęśAdapter implements Kwacząca {

	Obserwowany obserwowany;
	Gęś gęś;

	public GęśAdapter(Gęś gęś) {
		this.gęś = gęś;
		obserwowany = new Obserwowany(this);
	}

	@Override
	public void kwacz() {
		gęś.gęgaj();
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
