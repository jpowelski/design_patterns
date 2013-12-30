package template_method.ducks;

public class Kaczka implements Comparable {

	private String nazwa;
	private int waga;

	public Kaczka(String nazwa, int waga) {
		this.nazwa = nazwa;
		this.waga = waga;
	}

	@Override
	public String toString() {
		return "Kaczka [nazwa=" + nazwa + ", waga=" + waga + "]";
	}

	@Override
	public int compareTo(Object object) {
		Kaczka k = (Kaczka) object;

		if (this.waga < k.waga) {
			return -1;
		} else if (this.waga == k.waga) {
			return 0;
		} else {
			return 1;
		}
	}

}
