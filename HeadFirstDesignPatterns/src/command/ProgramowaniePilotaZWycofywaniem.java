package command;

import command.device.Światło;
import command.devicecommand.PolecenieWyłączŚwiatło;
import command.devicecommand.PolecenieWłączŚwiatło;

public class ProgramowaniePilotaZWycofywaniem {
	public static void main(String[] args) {

		SuperPilotZWycofywaniem pilot = new SuperPilotZWycofywaniem();

		Światło światłoJadalnia = new Światło("Jadalnia");

		PolecenieWłączŚwiatło światłoJadalniaWłącz = new PolecenieWłączŚwiatło(
				światłoJadalnia);
		PolecenieWyłączŚwiatło światłoJadalniaWyłącz = new PolecenieWyłączŚwiatło(
				światłoJadalnia);

		pilot.ustawPolecenie(0, światłoJadalniaWłącz, światłoJadalniaWyłącz);
		
		System.out.println(pilot);
		
		pilot.wciśniętoPrzyciskWłącz(0);
		pilot.wciśniętoPrzyciskWyłącz(0);
		System.out.println(pilot);
		pilot.wciśniętoPrzyciskWycofaj();
		
		pilot.wciśniętoPrzyciskWyłącz(0);
		pilot.wciśniętoPrzyciskWłącz(0);
		System.out.println(pilot);
		pilot.wciśniętoPrzyciskWycofaj();
		
	}

}
