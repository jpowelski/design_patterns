package observator;

public interface Podmiot {

	public void zarejestrujObserwatora(Obserwator o);
	public void usuńObserwatora(Obserwator o);
	public void powiadomObserwatorów();
}
