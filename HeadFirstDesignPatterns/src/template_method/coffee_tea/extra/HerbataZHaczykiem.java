package template_method.coffee_tea.extra;

public class HerbataZHaczykiem extends NapójZKofeinąZHaczykiem {

	@Override
	protected void zaparzenie() {
		System.out.println("Wkładanie torebki herbaty do wrzątku");
	}

	@Override
	protected void domieszanieDodatków() {
		System.out.println("Dodawanie cytryny");
	}

}
