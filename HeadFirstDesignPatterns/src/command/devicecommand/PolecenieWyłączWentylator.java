package command.devicecommand;

import command.Polecenie;
import command.device.Wentylator;

public class PolecenieWyłączWentylator implements Polecenie {

	private Wentylator wentylator;

	public PolecenieWyłączWentylator(Wentylator wentylator) {
		this.wentylator = wentylator;
	}

	@Override
	public void wykonaj() {
		wentylator.wyłącz();
	}

}