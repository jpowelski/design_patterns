package iterator;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuTest {

	public static void main(String[] args) {
		ArrayList<Menu> menu = new ArrayList<>(Arrays.asList(new PancakeHouseMenu(),
				new DinerMenu(), new UJackaMenu()));

		Kelnerka kelnerka = new Kelnerka(menu);
		kelnerka.drukujMenu();
	}
}
