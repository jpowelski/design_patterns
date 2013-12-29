package template_method.coffee_tea.extra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KawaZHaczykiem extends NapójZKofeinąZHaczykiem {

	@Override
	protected void zaparzenie() {
		System.out.println("Zaparzaniei przesączanie kawy przez filtr");
	}

	@Override
	protected void domieszanieDodatków() {
		System.out.println("Dodawanie cukru oraz mleka do smaku");
	}

	@Override
	protected boolean czyKlientChceDodatki() {
		String odpowiedź = pobierzOdpowiedzi();

		return odpowiedź.toLowerCase().startsWith("t");
	}

	private String pobierzOdpowiedzi() {
		String odpowiedź = null;

		System.out
				.println("Czy życzy Pan/i sobie dodania cukru i mleka do kawy (t/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			odpowiedź = in.readLine();
		} catch (IOException e) {
			System.err
					.println("Błąd wejścia-wyjścia podczas odczytywania odpowiedzi!");
		}
		if (odpowiedź == null) {
			return "n";
		}

		return odpowiedź;
	}
}
