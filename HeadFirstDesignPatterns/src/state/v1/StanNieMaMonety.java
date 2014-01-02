package state.v1;

public class StanNieMaMonety implements Stan {

	private AutomatSprzedającyV1 automat;

	public StanNieMaMonety(AutomatSprzedającyV1 automatSprzedającyV1) {
		this.automat = automatSprzedającyV1;
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
