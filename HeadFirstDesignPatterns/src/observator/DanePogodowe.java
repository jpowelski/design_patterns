package observator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

	private ArrayList<Obserwator> obserwatorzy;
	private float temperatura;
	private float wilgotność;
	private float ciśnienie;

	public DanePogodowe() {
		this.obserwatorzy = new ArrayList<>();
	}

	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	}

	@Override
	public void usuńObserwatora(Obserwator o) {
		int i = obserwatorzy.indexOf(o);
		if (i > 0) {
			obserwatorzy.remove(i);
		}
	}

	@Override
	public void powiadomObserwatorów() {
		for (Obserwator o : obserwatorzy) {
			o.aktualizacja(temperatura, wilgotność, ciśnienie);
		}
	}
	
	public void odczytZmiana(){
		powiadomObserwatorów();
	}
	
	public void ustawOdczyt(float temperatura, float wilgotność, float ciśnienie){
		this.temperatura = temperatura;
		this.wilgotność = wilgotność;
		this.ciśnienie = ciśnienie;
		odczytZmiana();
	}

}
