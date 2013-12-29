package template_method.coffee_tea;

public abstract class NapójZKofeiną {

	public final void recepturaParzenia() {
		gotowanieWody();
		zaparzenie();
		nalewanieDoFiliżanki();
		domieszanieDodatków();
	}

	protected void gotowanieWody() {
		System.out.println("Gotowanie wody");
	}

	protected abstract void zaparzenie();

	protected void nalewanieDoFiliżanki() {
		System.out.println("Nalewanie do filiżanki");
	}

	protected abstract void domieszanieDodatków();

}
