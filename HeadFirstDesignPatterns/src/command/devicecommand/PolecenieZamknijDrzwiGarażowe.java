package command.devicecommand;

import command.Polecenie;
import command.device.DrzwiGarażowe;

public class PolecenieZamknijDrzwiGarażowe implements Polecenie {

	private DrzwiGarażowe drzwiGarażowe;

	public PolecenieZamknijDrzwiGarażowe(DrzwiGarażowe drzwiGarażowe) {
		this.drzwiGarażowe = drzwiGarażowe;
	}

	@Override
	public void wykonaj() {
		drzwiGarażowe.wDół();
	}

	@Override
	public void wycofaj() {
		drzwiGarażowe.doGóry();
	}

}
