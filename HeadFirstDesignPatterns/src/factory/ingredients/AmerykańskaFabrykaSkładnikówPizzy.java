package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.cheese.SerMozzarella;
import factory.ingredients.clams.Małże;
import factory.ingredients.clams.MrożoneMałże;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.paste.GrubeChrupkieCiasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.pepperoni.PlastryPepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.sauce.SosPomidorowy;
import factory.ingredients.vegetables.Bakłażan;
import factory.ingredients.vegetables.CzarneOliwki;
import factory.ingredients.vegetables.Szpinak;
import factory.ingredients.vegetables.Warzywa;

/**
 * Fabryka rzeczywista
 * 
 * @author galica
 *
 */
public class AmerykańskaFabrykaSkładnikówPizzy implements
		FabrykaSkładnikówPizzy {

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
		Warzywa[] warzywa = { new Bakłażan(), new Szpinak(), new CzarneOliwki() };

		return warzywa;
	}

	@Override
	public Pepperoni utwórzPepperoni() {
		return new PlastryPepperoni();
	}

	@Override
	public Małże utwórzMałże() {
		return new MrożoneMałże();
	}

}
