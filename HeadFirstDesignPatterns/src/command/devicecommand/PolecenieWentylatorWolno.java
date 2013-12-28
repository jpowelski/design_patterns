package command.devicecommand;

import command.Polecenie;
import command.device.Wentylator;
import command.device.Wentylator.PRĘDKOŚĆ;

public class PolecenieWentylatorWolno implements Polecenie {

	private Wentylator wentylator;
	private PRĘDKOŚĆ poprzedniaPrędkość;

	public PolecenieWentylatorWolno(Wentylator wentylator) {
		this.wentylator = wentylator;
	}

	@Override
	public void wykonaj() {
		poprzedniaPrędkość = wentylator.pobierzPrędkość();
		wentylator.niskieObroty();
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