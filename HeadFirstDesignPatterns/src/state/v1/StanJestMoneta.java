package state.v1;

import java.util.Random;

public class StanJestMoneta implements Stan {

	private AutomatSprzedającyV1 automat;
	private Random random = new Random(System.currentTimeMillis());

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
		int wygrana = random.nextInt(10);
		if (wygrana == 0) {
			automat.ustawStan(automat.pobierzStanWygrana());
		} else {
			automat.ustawStan(automat.pobierzStanGumaSprzedana());
		}
	}

	@Override
	public void wydaj() {
		System.out.println("Nie wydano gumy");
	}

}
