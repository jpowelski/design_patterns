package factory;

public class Ameryka�skaPizzeria extends Pizzeria {

	@Override
	protected Pizza utw�rzPizza(String type) {
		if ("serowa".equals(type)){
			return new Ameryka�skaSerowaPizza();
		} else return null;
	}

}