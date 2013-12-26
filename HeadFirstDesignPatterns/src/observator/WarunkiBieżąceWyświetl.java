package observator;

public class WarunkiBie¿¹ceWyœwietl implements Obserwator, WyœwietlElement {

	private float temperatura;
	private float wilgotnoœæ;
	private Podmiot danePogodowe;

	public WarunkiBie¿¹ceWyœwietl(Podmiot danePogodowe) {
		this.danePogodowe = danePogodowe;
		this.danePogodowe.zarejestrujObserwatora(this);
	}

	@Override
	public void wyœwietl() {
		System.out.println("warunki bie¿¹ce: " + temperatura
				+ " stopni C oraz " + wilgotnoœæ + "% wilgotnoœæ");
	}

	@Override
	public void aktualizacja(float temp, float wilgotnoœæ, float ciœnienie) {
		this.temperatura = temp;
		this.wilgotnoœæ = wilgotnoœæ;
		wyœwietl();
	}

}
