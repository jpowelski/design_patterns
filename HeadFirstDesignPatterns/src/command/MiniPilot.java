package command;

public class MiniPilot {
	private Polecenie slot;

	public MiniPilot() {
	}

	public void ustawPolecenie(Polecenie polecenie) {
		this.slot = polecenie;
	}

	public void przyciskZostałNaciśnięty() {
		this.slot.wykonaj();
	}
}
