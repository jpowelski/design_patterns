package command;

public class MiniPilotTest {
	public static void main(String[] args) {
		MiniPilot pilot = new MiniPilot();

		�wiat�o �wiat�o = new �wiat�o();
		PolecenieW��cz�wiat�o w��cz�wiat�o = new PolecenieW��cz�wiat�o(�wiat�o);

		DrzwiGara�owe drzwiGara�owe = new DrzwiGara�owe();
		PolecenieOtw�rzDrzwiGara�owe otw�rzDrzwiGara�owe = new PolecenieOtw�rzDrzwiGara�owe(
				drzwiGara�owe);

		pilot.ustawPolecenie(w��cz�wiat�o);
		pilot.przyciskZosta�Naci�ni�ty();

		pilot.ustawPolecenie(otw�rzDrzwiGara�owe);
		pilot.przyciskZosta�Naci�ni�ty();
	}
}
