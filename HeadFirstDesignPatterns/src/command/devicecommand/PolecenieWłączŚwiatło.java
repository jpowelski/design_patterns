package command.devicecommand;

import command.Polecenie;
import command.device.Światło;

public class PolecenieWłączŚwiatło implements Polecenie {

	private Światło światło;

	public PolecenieWłączŚwiatło(Światło światło) {
		this.światło = światło;
	}

	@Override
	public void wykonaj() {
		światło.włącz();
	}

	@Override
	public void wycofaj() {
		światło.wyłącz();
	}

}
