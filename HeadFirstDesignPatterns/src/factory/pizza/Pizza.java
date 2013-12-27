package factory.pizza;

import factory.ingredients.cheese.Ser;
import factory.ingredients.clams.Ma��e;
import factory.ingredients.paste.Ciasto;
import factory.ingredients.pepperoni.Pepperoni;
import factory.ingredients.sauce.Sos;
import factory.ingredients.vegetables.Warzywa;

public abstract class Pizza {

	protected String nazwa;
	protected Ciasto ciasto;
	protected Sos sos;
	protected Warzywa warzywa[];
	protected Ser ser;
	protected Pepperoni pepperoni;
	protected Ma��e ma��e;
	
	public abstract void przygotowanie();

	public void pieczenie() {
		System.out.println("Pieczenie: 25 minut w temp. 250 stopni C");
	}
	
	public void krojenie() {
		System.out.println("Krojenie pizzy na 8 kawa�k�w");
	}
	
	public void pakowanie() {
		System.out.println("Pakowanie pizzy w oficjalne pude�ko");
	}
	
	public void ustawNazwa(String nazwa){
		this.nazwa = nazwa;
	}
	
	public String pobierzNazwa() {
		return nazwa;
	}
	
	public String toString(){
		return "";
	}
}
