package observator;

import java.util.ArrayList;

public class DanePogodowe implements Podmiot {

	private ArrayList<Obserwator> obserwatorzy;
	private float temperatura;
	private float wilgotno��;
	private float ci�nienie;

	public DanePogodowe() {
		this.obserwatorzy = new ArrayList<>();
	}

	@Override
	public void zarejestrujObserwatora(Obserwator o) {
		obserwatorzy.add(o);
	}

	@Override
	public void usu�Obserwatora(Obserwator o) {
		int i = obserwatorzy.indexOf(o);
		if (i > 0) {
			obserwatorzy.remove(i);
		}
	}

	@Override
	public void powiadomObserwator�w() {
		for (Obserwator o : obserwatorzy) {
			o.aktualizacja(temperatura, wilgotno��, ci�nienie);
		}
	}
	
	public void odczytZmiana(){
		powiadomObserwator�w();
	}
	
	public void ustawOdczyt(float temperatura, float wilgotno��, float ci�nienie){
		this.temperatura = temperatura;
		this.wilgotno�� = wilgotno��;
		this.ci�nienie = ci�nienie;
		odczytZmiana();
	}

}
