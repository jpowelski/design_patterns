package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.cheese.SerMozzarella;
import factory.ingredients.clams.Ma³¿e;
import factory.ingredients.clams.Mro¿oneMa³¿e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.paste.GrubeChrupkieCiasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.PlastryPepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.sauce.SosPomidorowy;
import factory.ingredients.vegetables.Bak³a¿an;
import factory.ingredients.vegetables.CzarneOliwki;
import factory.ingredients.vegetables.Szpinak;
import factory.ingredients.vegetables.Warzywa;

public class AmerykañskaFabrykaSk³adnikówPizzy implements
		FabrykaSk³adnikówPizzy {

	@Override
	public Ciasto utwórzCiasto() {
		return new GrubeChrupkieCiasto();
	}

	@Override
	public Sos utwórzSos() {
		return new SosPomidorowy();
	}

	@Override
	public Ser utwórzSer() {
		return new SerMozzarella();
	}

	@Override
	public Warzywa[] utwórzWarzywa() {
		Warzywa[] warzywa = { new Bak³a¿an(), new Szpinak(), new CzarneOliwki() };

		return warzywa;
	}

	@Override
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	@Override
	public Ma³¿e utwórzMa³¿e() {
		return new Mro¿oneMa³¿e();
	}

}
