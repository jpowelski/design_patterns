package observator;

public class WarunkiBie��ceWy�wietl implements Obserwator, Wy�wietlElement {

	private float temperatura;
	private float wilgotno��;
	private Podmiot danePogodowe;

	public WarunkiBie��ceWy�wietl(Podmiot danePogodowe) {
		this.danePogodowe = danePogodowe;
		this.danePogodowe.zarejestrujObserwatora(this);
	}

	@Override
	public void wy�wietl() {
		System.out.println("warunki bie��ce: " + temperatura
				+ " stopni C oraz " + wilgotno�� + "% wilgotno��");
	}

	@Override
	public void aktualizacja(float temp, float wilgotno��, float ci�nienie) {
		this.temperatura = temp;
		this.wilgotno�� = wilgotno��;
		wy�wietl();
	}

}
