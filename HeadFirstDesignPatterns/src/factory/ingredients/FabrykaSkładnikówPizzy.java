package factory.ingredients;

import factory.ingredients.cheese.Ser;
import factory.ingredients.clams.Małże;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.vegetables.Warzywa;

/**
 * <b>Fabryka abstrakcyjna</b>
 * 
 * dostarcza interfejs do tworzenia całych rodzin spokrewnionych lub zalećnych
 * od siebie obiektów bez konieczności określania ich klas rzeczywistych
 * 
 * @author galica
 * 
 */
public interface FabrykaSkładnikówPizzy {

	public Ciasto utwórzCiasto();

	public Sos utwórzSos();

	public Ser utwórzSer();

	public Warzywa[] utwórzWarzywa();

	public Pepperoni utwórzPepperoni();

	public Małże utwórzMałże();
}
