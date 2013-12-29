package template_method.coffee_tea.simple;

public class Herbata extends NapójZKofeiną {

	@Override
	protected void zaparzenie() {
		System.out.println("Wkładanie torebki herbaty do wrzątku");
	}

	@Override
	protected void domieszanieDodatków() {
		System.out.println("Dodawanie cytryny");
	}

}
