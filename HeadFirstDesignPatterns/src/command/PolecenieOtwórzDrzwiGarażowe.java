package command;

public class PolecenieOtwórzDrzwiGarażowe implements Polecenie {

	private DrzwiGarażowe drzwiGarażowe;

	public PolecenieOtwórzDrzwiGarażowe(DrzwiGarażowe drzwiGarażowe) {
		this.drzwiGarażowe = drzwiGarażowe;
	}

	@Override
	public void wykonaj() {
		drzwiGarażowe.doGóry();
	}

}
