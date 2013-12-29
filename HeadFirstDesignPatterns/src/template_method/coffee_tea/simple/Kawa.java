package template_method.coffee_tea.simple;

public class Kawa extends NapójZKofeiną {

	@Override
	protected void zaparzenie() {
		System.out.println("Zaparzaniei przesączanie kawy przez filtr");
	}

	@Override
	protected void domieszanieDodatków() {
		System.out.println("Dodawanie cukru oraz mleka do smaku");
	}

}
