package decorator;

public class MleczkoSojowe extends Sk�adnikiDekorator {
	private Nap�j nap�j;

	public MleczkoSojowe(Nap�j nap�j) {
		this.nap�j = nap�j;
	}

	@Override
	public String pobierzOpis() {
		return nap�j.pobierzOpis() + ", Czekolada";
	}

	@Override
	public double koszt() {
		return nap�j.koszt() + 0.15;
	}

}
