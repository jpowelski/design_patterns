package command;

import command.device.Wentylator;
import command.devicecommand.PolecenieWentylatorSzybko;
import command.devicecommand.PolecenieWentylatorWolno;
import command.devicecommand.PolecenieWyłączWentylator;

public class ProgramowaniePilotaZWycofywaniem {
	public static void main(String[] args) {

		SuperPilotZWycofywaniem pilot = new SuperPilotZWycofywaniem();

//		Światło światłoJadalnia = new Światło("Jadalnia");
//
//		PolecenieWłączŚwiatło światłoJadalniaWłącz = new PolecenieWłączŚwiatło(
//				światłoJadalnia);
//		PolecenieWyłączŚwiatło światłoJadalniaWyłącz = new PolecenieWyłączŚwiatło(
//				światłoJadalnia);
//
//		pilot.ustawPolecenie(0, światłoJadalniaWłącz, światłoJadalniaWyłącz);
//		
//		System.out.println("\n-----------------------\tŚWIATŁO\t-----------------------\n");
//		System.out.println(pilot);
//		
//		pilot.wciśniętoPrzyciskWłącz(0);
//		pilot.wciśniętoPrzyciskWyłącz(0);
//		System.out.println(pilot);
//		pilot.wciśniętoPrzyciskWycofaj();
//		
//		pilot.wciśniętoPrzyciskWyłącz(0);
//		pilot.wciśniętoPrzyciskWłącz(0);
//		System.out.println(pilot);
//		pilot.wciśniętoPrzyciskWycofaj();
//		
//		
		System.out.println("\n-----------------------\tWENTYLATOR\t-----------------------\n");
		
		
		Wentylator wentylator = new Wentylator();
		PolecenieWentylatorSzybko wentylatorSzybko = new PolecenieWentylatorSzybko(wentylator);
		PolecenieWentylatorWolno wentylatorWolno = new PolecenieWentylatorWolno(wentylator);
		PolecenieWyłączWentylator wyłączWentylator = new PolecenieWyłączWentylator(wentylator);
		
		pilot.ustawPolecenie(0, wentylatorWolno, wyłączWentylator);
		pilot.ustawPolecenie(1, wentylatorSzybko, wyłączWentylator);
		
		pilot.wciśniętoPrzyciskWłącz(0);
		pilot.wciśniętoPrzyciskWyłącz(0);
		System.out.println(pilot);
		pilot.wciśniętoPrzyciskWycofaj();
		
		pilot.wciśniętoPrzyciskWłącz(1);
		System.out.println(pilot);
		pilot.wciśniętoPrzyciskWycofaj();
	}

}
