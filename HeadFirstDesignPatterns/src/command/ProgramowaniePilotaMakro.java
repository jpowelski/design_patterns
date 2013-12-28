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

public class ProgramowaniePilotaMakro {
	public static void main(String[] args) {

		SuperPilot pilot = new SuperPilot();

		Światło światłoJadalnia = new Światło("Jadalnia");
		Wentylator wentylator = new Wentylator();
		DrzwiGarażowe drzwiGarażowe = new DrzwiGarażowe();
		WieżaStereo wieżaStereo = new WieżaStereo();

		PolecenieWłączŚwiatło światłoJadalniaWłącz = new PolecenieWłączŚwiatło(
				światłoJadalnia);
		PolecenieWyłączŚwiatło światłoJadalniaWyłącz = new PolecenieWyłączŚwiatło(
				światłoJadalnia);

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

		Polecenie[] włączImprezę = {światłoJadalniaWłącz, włączWentylator, otwórzDrzwiGarażowe, włączCDWieżaStereo};
		Polecenie[] wyłączImprezę = {światłoJadalniaWyłącz, wyłączWentylator, zamknijDrzwiGarażowe, wyłączWieżaStereo};
		
		MakroPolecenie makroPolecenieWłącz = new MakroPolecenie(włączImprezę);
		MakroPolecenie makroPolecenieWyłącz = new MakroPolecenie(wyłączImprezę);
		
		
		pilot.ustawPolecenie(0, makroPolecenieWłącz, makroPolecenieWyłącz);
		
		System.out.println(pilot);
		System.out.println("\nPoczątek imprezy\n");
		pilot.wciśniętoPrzyciskWłącz(0);
		System.out.println("\nKoniec imprezy\n");
		pilot.wciśniętoPrzyciskWyłącz(0);
		
	}

}
