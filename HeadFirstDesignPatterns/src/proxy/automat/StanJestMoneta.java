package proxy.automat;

import java.util.Random;

public class StanJestMoneta implements Stan {

	private transient AutomatSprzedający automat;
	private Random random = new Random(System.currentTimeMillis());

	public StanJestMoneta(AutomatSprzedający automatSprzedający) {
		this.automat = automatSprzedający;
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
