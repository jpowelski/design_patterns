package observator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

	private ArrayList<Obserwator> obserwatorzy;
	private float temperatura;
	private float wilgotnoœæ;
	private float ciœnienie;

	public DanePogodowe() {
		this.obserwatorzy = new ArrayList<>();
	}

	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	}

	@Override
	public void usuñObserwatora(Obserwator o) {
		int i = obserwatorzy.indexOf(o);
		if (i > 0) {
			obserwatorzy.remove(i);
		}
	}

	@Override
	public void powiadomObserwatorów() {
		for (Obserwator o : obserwatorzy) {
			o.aktualizacja(temperatura, wilgotnoœæ, ciœnienie);
		}
	}
	
	public void odczytZmiana(){
		powiadomObserwatorów();
	}
	
	public void ustawOdczyt(float temperatura, float wilgotnoœæ, float ciœnienie){
		this.temperatura = temperatura;
		this.wilgotnoœæ = wilgotnoœæ;
		this.ciœnienie = ciœnienie;
		odczytZmiana();
	}

}
