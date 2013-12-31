package iterator;

public class MenuTest {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		UJackaMenu uJackaMenu = new UJackaMenu();
		
		Kelnerka kelnerka = new Kelnerka(pancakeHouseMenu, dinerMenu, uJackaMenu);
		kelnerka.drukujMenu();
	}
}
