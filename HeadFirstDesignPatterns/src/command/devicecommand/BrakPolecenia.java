package command.devicecommand;

import command.Polecenie;

public class BrakPolecenia implements Polecenie{

	@Override
	public void wykonaj() {
		System.out.println("-");
	}

}
