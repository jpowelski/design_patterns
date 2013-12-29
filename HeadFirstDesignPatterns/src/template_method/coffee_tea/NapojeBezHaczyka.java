package template_method.coffee_tea;

public class NapojeBezHaczyka {

	public static void main(String[] args) {

		NapójZKofeiną herbata = new Herbata();

		System.out.println("\nPrzyrządzam herbatę...");
		herbata.recepturaParzenia();

		NapójZKofeiną kawa = new Kawa();
		System.out.println("\nA teraz kawkę...");
		kawa.recepturaParzenia();
	}
}
