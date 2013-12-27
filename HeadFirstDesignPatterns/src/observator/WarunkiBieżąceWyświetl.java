package observator;

public class WarunkiBieżąceWyświetl implements Obserwator, WyświetlElement {

	private float temperatura;
	private float wilgotność;
	private Podmiot danePogodowe;

	public WarunkiBieżąceWyświetl(Podmiot danePogodowe) {
		this.danePogodowe = danePogodowe;
		this.danePogodowe.zarejestrujObserwatora(this);
	}

	@Override
	public void wyświetl() {
		System.out.println("warunki Bieżące: " + temperatura
				+ " stopni C oraz " + wilgotność + "% wilgotność");
	}

	@Override
	public void aktualizacja(float temp, float wilgotność, float ciśnienie) {
		this.temperatura = temp;
		this.wilgotność = wilgotność;
		wyświetl();
	}

}
