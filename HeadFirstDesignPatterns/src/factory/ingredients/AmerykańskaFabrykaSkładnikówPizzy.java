package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.cheese.SerMozzarella;
import factory.ingredients.clams.Ma��e;
import factory.ingredients.clams.Mro�oneMa��e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.paste.GrubeChrupkieCiasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.PlastryPepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.sauce.SosPomidorowy;
import factory.ingredients.vegetables.Bak�a�an;
import factory.ingredients.vegetables.CzarneOliwki;
import factory.ingredients.vegetables.Szpinak;
import factory.ingredients.vegetables.Warzywa;

public class Ameryka�skaFabrykaSk�adnik�wPizzy implements
		FabrykaSk�adnik�wPizzy {

	@Override
	public Ciasto utw�rzCiasto() {
		return new GrubeChrupkieCiasto();
	}

	@Override
	public Sos utw�rzSos() {
		return new SosPomidorowy();
	}

	@Override
	public Ser utw�rzSer() {
		return new SerMozzarella();
	}

	@Override
	public Warzywa[] utw�rzWarzywa() {
		Warzywa[] warzywa = { new Bak�a�an(), new Szpinak(), new CzarneOliwki() };

		return warzywa;
	}

	@Override
	public Pepperoni utw�rzPepperoni() {
		return new PlastryPepperoni();
	}

	@Override
	public Ma��e utw�rzMa��e() {
		return new Mro�oneMa��e();
	}

}
