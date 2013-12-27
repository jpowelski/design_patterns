package command;

public class MiniPilotTest {
	public static void main(String[] args) {
		MiniPilot pilot = new MiniPilot();

		Œwiat³o œwiat³o = new Œwiat³o();
		PolecenieW³¹czŒwiat³o w³¹czŒwiat³o = new PolecenieW³¹czŒwiat³o(œwiat³o);

		DrzwiGara¿owe drzwiGara¿owe = new DrzwiGara¿owe();
		PolecenieOtwórzDrzwiGara¿owe otwórzDrzwiGara¿owe = new PolecenieOtwórzDrzwiGara¿owe(
				drzwiGara¿owe);

		pilot.ustawPolecenie(w³¹czŒwiat³o);
		pilot.przyciskZosta³Naciœniêty();

		pilot.ustawPolecenie(otwórzDrzwiGara¿owe);
		pilot.przyciskZosta³Naciœniêty();
	}
}
