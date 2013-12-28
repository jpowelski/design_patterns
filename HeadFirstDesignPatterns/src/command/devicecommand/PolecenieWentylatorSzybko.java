package command.devicecommand;

import command.Polecenie;
import command.device.Wentylator;
import command.device.Wentylator.PRĘDKOŚĆ;

public class PolecenieWentylatorSzybko implements Polecenie {

	private Wentylator wentylator;
	private PRĘDKOŚĆ poprzedniaPrędkość;

	public PolecenieWentylatorSzybko(Wentylator wentylator) {
		this.wentylator = wentylator;
	}

	@Override
	public void wykonaj() {
		poprzedniaPrędkość = wentylator.pobierzPrędkość();
		wentylator.wysokieObroty();
	}

	@Override
	public void wycofaj() {
		switch (poprzedniaPrędkość) {
		case SZYBKO:
			wentylator.wysokieObroty();
			break;
		case ŚREDNIO:
			wentylator.średnieObroty();
			break;
		case WOLNO:
			wentylator.niskieObroty();
			break;
		case WYŁĄCZ:
		default:
			wentylator.wyłącz();
			break;
		}
	}

}