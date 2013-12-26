package factory;

public class AmerykañskaSerowaPizza extends Pizza {

	public AmerykañskaSerowaPizza(){
		nazwa = "Amerykañska pizza serowa";
		ciasto = "Extra grube, chrupkie ciasto";
		sos = "Sos z pomidorów œliwkowych";
		
		dodatki.add("Grubo tarty ser Mozzarella");
	}
	
	void krojenie(){
		System.out.println("Krojenie pizzy na kwadratowe kawa³ki");
	}
}
