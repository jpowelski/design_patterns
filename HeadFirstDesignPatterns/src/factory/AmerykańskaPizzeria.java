package factory;

public class AmerykañskaPizzeria extends Pizzeria {

	@Override
	protected Pizza utwórzPizza(String type) {
		if ("serowa".equals(type)){
			return new AmerykañskaSerowaPizza();
		} else return null;
	}

}