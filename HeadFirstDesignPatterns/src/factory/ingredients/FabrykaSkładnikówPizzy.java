package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.clams.Ma��e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.vegetables.Warzywa;

/**
 * <b>Fabryka abstrakcyjna</b>
 * 
 * dostarcza interfejs do tworzenia ca�ych rodzin spokrewnionych lub zale�nych
 * od siebie obiekt�w bez konieczno�ci okre�lania ich klas rzeczywistych
 * 
 * @author galica
 * 
 */
public interface FabrykaSk�adnik�wPizzy {

	public Ciasto utw�rzCiasto();

	public Sos utw�rzSos();

	public Ser utw�rzSer();

	public Warzywa[] utw�rzWarzywa();

	public Pepperoni utw�rzPepperoni();

	public Ma��e utw�rzMa��e();
}
