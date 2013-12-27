package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.cheese.SerReggiano;
import factory.ingredients.clams.Ma³¿e;
import factory.ingredients.clams.Œwie¿eMa³¿e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.paste.CienkieChrupkieCiasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.PlastryPepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.sauce.SosMarinara;
import factory.ingredients.vegetables.Cebula;
import factory.ingredients.vegetables.CzerwonaPapryka;
import factory.ingredients.vegetables.Czosnek;
import factory.ingredients.vegetables.Pieczarki;
import factory.ingredients.vegetables.Warzywa;

public class W³oskaFabrykaSk³adnikówPizzy implements FabrykaSk³adnikówPizzy {

	@Override
	public Ciasto utwórzCiasto() {
		return new CienkieChrupkieCiasto();
	}

	@Override
	public Sos utwórzSos() {
		return new SosMarinara();
	}

	@Override
	public Ser utwórzSer() {
		return new SerReggiano();
	}

	@Override
	public Warzywa[] utwórzWarzywa() {
		Warzywa[] warzywa = { new Czosnek(), new Cebula(), new Pieczarki(), new CzerwonaPapryka()};
		
		return warzywa;
	}

	@Override
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	@Override
	public Ma³¿e utwórzMa³¿e() {
		return new Œwie¿eMa³¿e();
	}


}
