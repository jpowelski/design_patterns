package template_method.ducks;

import java.util.Arrays;

public class TestSortowaniaKaczek {

	public static void main(String[] args) {

		Kaczka[] kaczki = { new Kaczka("a", 10), new Kaczka("b", 1),
				new Kaczka("c", 5), new Kaczka("d", 7), new Kaczka("e", 1),
				new Kaczka("f", 9), new Kaczka("g", 8), new Kaczka("h", 31),
				new Kaczka("j", 2), };

		System.out.println("Przed sortowaniem:");
		wyświetlKaczki(kaczki);

		Arrays.sort(kaczki);

		System.out.println("\nPo sortowaniu:");
		wyświetlKaczki(kaczki);
	}

	private static void wyświetlKaczki(Kaczka[] kaczki) {
		for (Kaczka k : kaczki) {
			System.out.println(k);
		}
	}
}
