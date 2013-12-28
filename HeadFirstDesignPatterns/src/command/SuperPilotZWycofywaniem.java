package command;

import command.devicecommand.BrakPolecenia;

public class SuperPilotZWycofywaniem {
	private Polecenie[] poleceniaWłącz;
	private Polecenie[] poleceniaWyłącz;
	private Polecenie polecenieWycofaj;

	public SuperPilotZWycofywaniem() {
		poleceniaWłącz = new Polecenie[7];
		poleceniaWyłącz = new Polecenie[7];

		Polecenie brakPolecenia = new BrakPolecenia();
		for (int i = 0; i < 7; i++) {
			poleceniaWłącz[i] = brakPolecenia;
			poleceniaWyłącz[i] = brakPolecenia;
		}
		polecenieWycofaj = brakPolecenia;
	}

	public void ustawPolecenie(int slot, Polecenie polecenieWłącz,
			Polecenie polecenieWyłącz) {
		poleceniaWłącz[slot] = polecenieWłącz;
		poleceniaWyłącz[slot] = polecenieWyłącz;
	}

	public void wciśniętoPrzyciskWłącz(int slot) {
		poleceniaWłącz[slot].wykonaj();
		polecenieWycofaj = poleceniaWłącz[slot];
	}

	public void wciśniętoPrzyciskWyłącz(int slot) {
		poleceniaWyłącz[slot].wykonaj();
		polecenieWycofaj = poleceniaWyłącz[slot];
	}

	public void wciśniętoPrzyciskWycofaj(){
		polecenieWycofaj.wycofaj();
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n------ SuperPilot ------\n");
		for (int i = 0; i < poleceniaWłącz.length; i++) {
			sb.append("[slot ").append(i).append("] ")
					.append(poleceniaWłącz[i].getClass().getName())
					.append("\t\t  ")
					.append(poleceniaWyłącz[i].getClass().getName())
					.append("\n");
		}
		sb.append("[undo]").append(polecenieWycofaj.getClass().getName())
				.append("\n");

		return sb.toString();
	}
}
