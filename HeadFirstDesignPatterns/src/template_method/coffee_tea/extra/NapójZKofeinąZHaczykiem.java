package template_method.coffee_tea.extra;

/**
 * @see {@link NapójZKofeiną}
 * @author galica
 * 
 */
public abstract class NapójZKofeinąZHaczykiem {

	public final void recepturaParzenia() {
		gotowanieWody();
		zaparzenie();
		nalewanieDoFiliżanki();
		if (czyKlientChceDodatki()) {
			domieszanieDodatków();
		}
	}

	protected void gotowanieWody() {
		System.out.println("Gotowanie wody");
	}

	protected abstract void zaparzenie();

	protected void nalewanieDoFiliżanki() {
		System.out.println("Nalewanie do filiżanki");
	}

	protected boolean czyKlientChceDodatki() {
		return true;
	}

	protected abstract void domieszanieDodatków();

}
