package complex.ducks;

public class KwakLicznik implements Kwacząca {

	Kwacząca kaczka;
	static int liczbaKwaknięć;

	public KwakLicznik(Kwacząca kwacząca) {
		kaczka = kwacząca;
	}

	@Override
	public void kwacz() {
		kaczka.kwacz();
		liczbaKwaknięć++;
	}

	public static int pobierzLiczbęKwaknięć() {
		return liczbaKwaknięć;
	}

	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		kaczka.zarejestrujObserwatora(obserwator);
	}

	@Override
	public void powiadomObserwatorów() {
		kaczka.powiadomObserwatorów();
	}

}
