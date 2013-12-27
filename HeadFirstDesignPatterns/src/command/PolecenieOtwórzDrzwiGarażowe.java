package command;

public class PolecenieOtw�rzDrzwiGara�owe implements Polecenie {

	private DrzwiGara�owe drzwiGara�owe;

	public PolecenieOtw�rzDrzwiGara�owe(DrzwiGara�owe drzwiGara�owe) {
		this.drzwiGara�owe = drzwiGara�owe;
	}

	@Override
	public void wykonaj() {
		drzwiGara�owe.doG�ry();
	}

}
