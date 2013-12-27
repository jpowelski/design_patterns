package command;

import command.device.DrzwiGarażowe;
import command.device.Światło;
import command.devicecommand.PolecenieOtwórzDrzwiGarażowe;
import command.devicecommand.PolecenieWłączŚwiatło;

public class MiniPilotTest {
	public static void main(String[] args) {
		MiniPilot pilot = new MiniPilot();

		Światło światło = new Światło();
		PolecenieWłączŚwiatło włączŚwiatło = new PolecenieWłączŚwiatło(światło);

		DrzwiGarażowe DrzwiGarażowe = new DrzwiGarażowe();
		PolecenieOtwórzDrzwiGarażowe otwórzDrzwiGarażowe = new PolecenieOtwórzDrzwiGarażowe(
				DrzwiGarażowe);

		pilot.ustawPolecenie(włączŚwiatło);
		pilot.przyciskZostałNaciśnięty();

		pilot.ustawPolecenie(otwórzDrzwiGarażowe);
		pilot.przyciskZostałNaciśnięty();
	}
}
