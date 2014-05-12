package complex.ducks;

import java.util.ArrayList;
import java.util.Iterator;

public class Stado implements Kwacząca {

	Obserwowany obserwowany;
	Gęś gęś;
	ArrayList<Kwacząca> ptaki = new ArrayList<>();

	public Stado() {
		obserwowany = new Obserwowany(this);
	}

	public void dodaj(Kwacząca ptak) {
		ptaki.add(ptak);
	}

	@Override
	public void kwacz() {
		Iterator<Kwacząca> iterator = ptaki.iterator();
		while (iterator.hasNext()) {
			Kwacząca ptak = iterator.next();
			ptak.kwacz();
		}
	}

	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		Iterator<Kwacząca> iterator = ptaki.iterator();
		while (iterator.hasNext()) {
			Kwacząca ptak = iterator.next();
			ptak.zarejestrujObserwatora(obserwator);
		}
	}

	@Override
	public void powiadomObserwatorów() {
	}
}
