package decorator;

public class BitaŚmietana extends SkładnikiDekorator {
	private Napój napój;

	public BitaŚmietana(Napój napój) {
		this.napój = napój;
	}

	@Override
	public String pobierzOpis() {
		return napój.pobierzOpis() + ", Czekolada";
	}

	@Override
	public double koszt() {
		return napój.koszt() + 0.10;
	}

}
