package command.devicecommand;

import command.Polecenie;
import command.device.WieżaStereo;

public class PolecenieWłączCDWieżaStereo implements Polecenie {

	private WieżaStereo wieża;

	public PolecenieWłączCDWieżaStereo(WieżaStereo wieża) {
		this.wieża = wieża;
	}

	@Override
	public void wykonaj() {
		wieża.włącz();
		wieża.ustawCD();
		wieża.ustawGłośność(13);
	}

	@Override
	public void wycofaj() {
		wieża.wyłącz();
	}

}