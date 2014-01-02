package state.v1;

public class StanJestMoneta implements Stan {

	private AutomatSprzedającyV1 automat;

	public StanJestMoneta(AutomatSprzedającyV1 automatSprzedającyV1) {
		this.automat = automatSprzedającyV1;
	}

	@Override
	public void włóżMonetę() {
		System.out.println("Możesz włożyć tylko jedną monetę");
	}

	@Override
	public void zwróćMonetę() {
		System.out.println("Moneta zwrócona");
		automat.ustawStan(automat.pobierzStanNieMaMonety());
	}

	@Override
	public void przekręćGałkę() {
		System.out.println("Obróciłeś gałkę...");
		automat.ustawStan(automat.pobierzStanGumaSprzedana());
	}

	@Override
	public void wydaj() {
		System.out.println("Nie wydano gumy");
	}

}
