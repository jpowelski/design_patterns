package decorator;

public abstract class Napój {
	protected String opis = "Napój nieznany";
	
	public String pobierzOpis(){
		return opis;
	}
	
	public abstract double koszt();
}
