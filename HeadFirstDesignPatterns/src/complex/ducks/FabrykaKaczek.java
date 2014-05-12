package complex.ducks;

public class FabrykaKaczek extends AbstrakcyjnaFabrykaKaczek {

	@Override
	public Kwacząca utwórzDzikaKaczka() {
		return new DzikaKaczka();
	}

	@Override
	public Kwacząca utwórzPłaskonosKaczka() {
		return new PłaskonosKaczka();
	}

	@Override
	public Kwacząca utwórzWabikKaczka() {
		return new WabikKaczka();
	}

	@Override
	public Kwacząca utwórzGumowaKaczka() {
		return new GumowaKaczka();
	}

}
