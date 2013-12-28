package command.devicecommand;

import command.Polecenie;
import command.device.Światło;

public class PolecenieWyłączŚwiatło implements Polecenie {

	private Światło światło;

	public PolecenieWyłączŚwiatło(Światło światło) {
		this.światło = światło;
	}

	@Override
	public void wykonaj() {
		światło.wyłącz();
	}

	@Override
	public void wycofaj() {
		światło.włącz();
	}

}