package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.cheese.SerReggiano;
import factory.ingredients.clams.Ma��e;
import factory.ingredients.clams.�wie�eMa��e;
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

public class W�oskaFabrykaSk�adnik�wPizzy implements FabrykaSk�adnik�wPizzy {

	@Override
	public Ciasto utw�rzCiasto() {
		return new CienkieChrupkieCiasto();
	}

	@Override
	public Sos utw�rzSos() {
		return new SosMarinara();
	}

	@Override
	public Ser utw�rzSer() {
		return new SerReggiano();
	}

	@Override
	public Warzywa[] utw�rzWarzywa() {
		Warzywa[] warzywa = { new Czosnek(), new Cebula(), new Pieczarki(), new CzerwonaPapryka()};
		
		return warzywa;
	}

	@Override
	public Pepperoni utw�rzPepperoni() {
		return new PlastryPepperoni();
	}

	@Override
	public Ma��e utw�rzMa��e() {
		return new �wie�eMa��e();
	}


}
