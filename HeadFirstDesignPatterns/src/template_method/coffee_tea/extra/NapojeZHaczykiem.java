package template_method.coffee_tea.extra;

public class NapojeZHaczykiem {

	public static void main(String[] args) {

		NapójZKofeinąZHaczykiem herbata = new HerbataZHaczykiem();

		System.out.println("\nPrzyrządzam herbatę...");
		herbata.recepturaParzenia();

		NapójZKofeinąZHaczykiem kawa = new KawaZHaczykiem();
		System.out.println("\nA teraz kawkę...");
		kawa.recepturaParzenia();
	}
}
