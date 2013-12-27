package observator;

public class StacjaMeteo {

	public static void main(String[] args) {
		DanePogodowe danePogodowe = new DanePogodowe();
		
		WarunkiBieżąceWyświetl warunkiBieżąceWyświetl = new WarunkiBieżąceWyświetl(danePogodowe);
		//2
		//3
		
		danePogodowe.ustawOdczyt(26.6f, 65f, 1013.1f);
		danePogodowe.ustawOdczyt(27.7f, 75f, 997f);
		danePogodowe.ustawOdczyt(25.5f, 90f, 997f);
		
	}
}
