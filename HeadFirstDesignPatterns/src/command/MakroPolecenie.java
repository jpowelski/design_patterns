package command;

public class MakroPolecenie implements Polecenie {

	private Polecenie[] polecenia;
	
	public MakroPolecenie(Polecenie[] polecenia) {
		this.polecenia = polecenia;
	}

	@Override
	public void wykonaj() {
		for(Polecenie p : polecenia){
			p.wykonaj();
		}
	}

	@Override
	public void wycofaj() {
		for(Polecenie p : polecenia){
			p.wycofaj();
		}
	}

}
