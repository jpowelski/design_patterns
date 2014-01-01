package iterator.composite;

public class Kelnerka {

	private MenuSkładnik menu;

	public Kelnerka(MenuSkładnik menu) {
		this.menu = menu;
	}

	public void drukujMenu() {
		menu.drukuj();
	}

}
