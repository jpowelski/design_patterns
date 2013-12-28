package command.devicecommand;

import command.Polecenie;
import command.device.Wentylator;

public class PolecenieWłączWentylator implements Polecenie {

	private Wentylator wentylator;

	public PolecenieWłączWentylator(Wentylator wentylator) {
		this.wentylator = wentylator;
	}

	@Override
	public void wykonaj() {
		wentylator.włącz();
	}

	@Override
	public void wycofaj() {
		wentylator.wyłącz();
	}

}