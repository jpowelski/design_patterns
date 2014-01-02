package state.v1;

public class AutomatSprzedającyV1 {

	private Stan stanBrakGum;
	private Stan stanNieMaMonety;
	private Stan stanJestMoneta;
	private Stan stanGumaSprzedana;

	private Stan stan = stanBrakGum;
	private int liczba = 0;

	public AutomatSprzedającyV1(int liczba) {
		stanBrakGum = new StanBrakGum(this);
		stanNieMaMonety = new StanNieMaMonety(this);
		stanJestMoneta = new StanJestMoneta(this);
		stanGumaSprzedana = new StanGumaSprzedana(this);

		this.liczba = liczba;
		if (liczba > 0) {
			stan = stanNieMaMonety;
		}
	}

	public void włóżMonetę() {
		stan.włóżMonetę();
	}

	public void zwróćMonetę() {
		stan.zwróćMonetę();
	}

	public void przekręćGałkę() {
		stan.przekręćGałkę();
		stan.wydaj();
	}

	public void ustawStan(Stan stan) {
		this.stan = stan;
	}

	public int pobierzLiczba(){
		return liczba;
	}
	
	
	
	public Stan pobierzStanBrakGum() {
		return stanBrakGum;
	}

	public Stan pobierzStanNieMaMonety() {
		return stanNieMaMonety;
	}

	public Stan pobierzStanJestMoneta() {
		return stanJestMoneta;
	}

	public Stan pobierzStanGumaSprzedana() {
		return stanGumaSprzedana;
	}

	void zwolnijGume(){
		System.out.println("Wypada guma...");
		if (liczba != 0){
			liczba--;
		}
	}

	@Override
	public String toString() {
		String result = "\nAutomatSprzedający [zapas=" + liczba + "]\n";
		if (stan == stanBrakGum) {
			result += "Automat jest pusty";
		} else if (stan == stanNieMaMonety) {
			result += "Automat oczekuje na monetę";
		} else if (stan == stanJestMoneta) {
			result += "Moneta w automacie";
		} else if (stan == stanGumaSprzedana) {
			result += "Wydawanie gumy";
		}

		return result + "\n";
	}

}
