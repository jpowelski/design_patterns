package complex.ducks;

import java.util.ArrayList;
import java.util.Iterator;

public class Obserwowany implements KwakObserwowany {

	ArrayList<Obserwator> obserwatorzy = new ArrayList<>();
	KwakObserwowany kaczka;
	
	public Obserwowany(KwakObserwowany kwaczka) {
		this.kaczka = kwaczka;
	}

	@Override
	public void zarejestrujObserwatora(Obserwator obserwator) {
		obserwatorzy.add(obserwator);
	}

	@Override
	public void powiadomObserwatorów() {
		Iterator<Obserwator> iterator = obserwatorzy.iterator();
		while(iterator.hasNext()){
			Obserwator obserwator = iterator.next();
			obserwator.aktualizuj(kaczka);
		}
	}

}
