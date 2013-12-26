package observator;

public interface Podmiot {

	public void zarejestrujObserwatora(Obserwator o);
	public void usuñObserwatora(Obserwator o);
	public void powiadomObserwatorów();
}
