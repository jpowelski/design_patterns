package proxy.automat;

public class StanNieMaMonety implements Stan {

	private transient AutomatSprzedający automat;

	public StanNieMaMonety(AutomatSprzedający automatSprzedający) {
		this.automat = automatSprzedający;
	}

	@Override
	public void włóżMonetę() {
		System.out.println("Moneta przyjęta");
		automat.ustawStan(automat.pobierzStanJestMoneta());
	}

	@Override
	public void zwróćMonetę() {
		System.out.println("Nie włożyłeś monety");
	}

	@Override
	public void przekręćGałkę() {
		System.out.println("Zanim przekręcisz gałkę, wrzuć monetę");
	}

	@Override
	public void wydaj() {
		System.out.println("Najpierw zapłać");
	}

}
