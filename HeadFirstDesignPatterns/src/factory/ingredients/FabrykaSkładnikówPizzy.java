package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.clams.Ma³¿e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.vegetables.Warzywa;

/**
 * <b>Fabryka abstrakcyjna</b>
 * 
 * dostarcza interfejs do tworzenia ca³ych rodzin spokrewnionych lub zale¿nych
 * od siebie obiektów bez koniecznoœci okreœlania ich klas rzeczywistych
 * 
 * @author galica
 * 
 */
public interface FabrykaSk³adnikówPizzy {

	public Ciasto utwórzCiasto();

	public Sos utwórzSos();

	public Ser utwórzSer();

	public Warzywa[] utwórzWarzywa();

	public Pepperoni utwórzPepperoni();

	public Ma³¿e utwórzMa³¿e();
}
