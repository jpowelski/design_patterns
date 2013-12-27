package command;

public class PolecenieOtwórzDrzwiGara¿owe implements Polecenie {

	private DrzwiGara¿owe drzwiGara¿owe;

	public PolecenieOtwórzDrzwiGara¿owe(DrzwiGara¿owe drzwiGara¿owe) {
		this.drzwiGara¿owe = drzwiGara¿owe;
	}

	@Override
	public void wykonaj() {
		drzwiGara¿owe.doGóry();
	}

}
