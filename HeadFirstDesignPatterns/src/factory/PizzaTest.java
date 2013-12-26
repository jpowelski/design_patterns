package factory;

public class PizzaTest {

	public static void main(String[] args) {
		Pizzeria w³oska = new W³oskaPizzeria();
		Pizzeria amerykañska = new AmerykañskaPizzeria();
		
		Pizza pizza = w³oska.zamówPizza("serowa");
		System.out.println("Eryk zamówi³: " + pizza.pobierzNazwa() + "\n");
		
		pizza = amerykañska.zamówPizza("serowa");
		System.out.println("Jacek zamówi³: " + pizza.pobierzNazwa() + "\n");
	}

}
