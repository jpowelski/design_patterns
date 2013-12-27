package command;

import command.devicecommand.BrakPolecenia;

public class SuperPilot {
	private Polecenie[] poleceniaWłącz;
	private Polecenie[] poleceniaWyłącz;

	public SuperPilot() {
		poleceniaWłącz = new Polecenie[7];
		poleceniaWyłącz = new Polecenie[7];

		Polecenie brakPolecenie = new BrakPolecenia();
		for (int i = 0; i < 7; i++) {
			poleceniaWłącz[i] = brakPolecenie;
			poleceniaWyłącz[i] = brakPolecenie;
		}
	}

	public void ustawPolecenie(int slot, Polecenie polecenieWłącz,
			Polecenie polecenieWyłącz) {
		poleceniaWłącz[slot] = polecenieWłącz;
		poleceniaWyłącz[slot] = polecenieWyłącz;
	}

	public void wciśniętoPrzyciskWłącz(int slot) {
		poleceniaWłącz[slot].wykonaj();
	}

	public void wciśniętoPrzyciskWyłącz(int slot) {
		poleceniaWyłącz[slot].wykonaj();
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n------ SuperPilot ------\n");
		for (int i = 0; i < poleceniaWłącz.length; i++) {
			sb.append("[slot ").append(i).append("] ");
			sb.append(poleceniaWłącz[i].getClass().getName());
			sb.append("\t\t  ");
			sb.append(poleceniaWyłącz[i].getClass().getName());
			sb.append("\n");
		}
		return sb.toString();
	}
}
