package factory;

public class Ameryka�skaSerowaPizza extends Pizza {

	public Ameryka�skaSerowaPizza(){
		nazwa = "Ameryka�ska pizza serowa";
		ciasto = "Extra grube, chrupkie ciasto";
		sos = "Sos z pomidor�w �liwkowych";
		
		dodatki.add("Grubo tarty ser Mozzarella");
	}
	
	void krojenie(){
		System.out.println("Krojenie pizzy na kwadratowe kawa�ki");
	}
}
