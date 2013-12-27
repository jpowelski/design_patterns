package command.devicecommand;

import command.Polecenie;
import command.device.WieżaStereo;

public class PolecenieWyłączWieżaStereo implements Polecenie {

	private WieżaStereo wieża;

	public PolecenieWyłączWieżaStereo(WieżaStereo wieża) {
		this.wieża = wieża;
	}

	@Override
	public void wykonaj() {
		wieża.wyłącz();
	}

}