package command;

import command.device.DrzwiGarażowe;
import command.device.Wentylator;
import command.device.WieżaStereo;
import command.device.Światło;
import command.devicecommand.PolecenieOtwórzDrzwiGarażowe;
import command.devicecommand.PolecenieWyłączWentylator;
import command.devicecommand.PolecenieWyłączWieżaStereo;
import command.devicecommand.PolecenieWyłączŚwiatło;
import command.devicecommand.PolecenieWłączCDWieżaStereo;
import command.devicecommand.PolecenieWłączWentylator;
import command.devicecommand.PolecenieWłączŚwiatło;
import command.devicecommand.PolecenieZamknijDrzwiGarażowe;

public class ProgramowaniePilota {
	public static void main(String[] args) {

		SuperPilot pilot = new SuperPilot();

		Światło światłoJadalnia = new Światło("Jadalnia");
		Światło światłoKuchnia = new Światło("Kuchnia");
		Wentylator wentylator = new Wentylator();
		DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe();
		WieżaStereo wieżaStereo = new WieżaStereo();

		PolecenieWłączŚwiatło światłoJadalniaWłącz = new PolecenieWłączŚwiatło(
				światłoJadalnia);
		PolecenieWyłączŚwiatło światłoJadalniaWyłącz = new PolecenieWyłączŚwiatło(
				światłoJadalnia);
		PolecenieWłączŚwiatło światłoKuchniaWłącz = new PolecenieWłączŚwiatło(
				światłoKuchnia);
		PolecenieWyłączŚwiatło światłoKuchniaWyłącz = new PolecenieWyłączŚwiatło(
				światłoKuchnia);

		PolecenieWłączWentylator włączWentylator = new PolecenieWłączWentylator(
				wentylator);
		PolecenieWyłączWentylator wyłączWentylator = new PolecenieWyłączWentylator(
				wentylator);

		PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = new PolecenieOtwórzDrzwiGarażowe(
				drzwiGarażowe);
		PolecenieZamknijDrzwiGarażowe zamknijDrzwiGarażowe = new PolecenieZamknijDrzwiGarażowe(
				drzwiGarażowe);

		PolecenieWłączCDWieżaStereo włączCDWieżaStereo = new PolecenieWłączCDWieżaStereo(
				wieżaStereo);
		PolecenieWyłączWieżaStereo wyłączWieżaStereo = new PolecenieWyłączWieżaStereo(
				wieżaStereo);

		pilot.ustawPolecenie(0, światłoJadalniaWłącz, światłoJadalniaWyłącz);
		pilot.ustawPolecenie(1, światłoKuchniaWłącz, światłoKuchniaWyłącz);
		pilot.ustawPolecenie(2, włączWentylator, wyłączWentylator);
		pilot.ustawPolecenie(3, włączCDWieżaStereo, wyłączWieżaStereo);
		
		System.out.println(pilot);
		
		pilot.wciśniętoPrzyciskWłącz(0);
		pilot.wciśniętoPrzyciskWyłącz(0);
		pilot.wciśniętoPrzyciskWłącz(1);
		pilot.wciśniętoPrzyciskWyłącz(1);
		pilot.wciśniętoPrzyciskWłącz(2);
		pilot.wciśniętoPrzyciskWyłącz(2);
		pilot.wciśniętoPrzyciskWłącz(3);
		pilot.wciśniętoPrzyciskWyłącz(3);
		
	}

}
