package template_method.coffee_tea.simple;

/**
 * <b>Wzorzec metoda szablonowa</b> definiuje szkielet danego algorytmu w określonej
 * metodzie, przekazując realizację niektórych jego kroków do klas podrzednych.
 * wzorzec ten pozwala klasom podrzędnym na redefiniowanie pewnych kroków
 * algorytmu, ale jednocześnie uniemożliwia zmianę jego struktury.
 * 
 * @author galica
 * 
 */
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
