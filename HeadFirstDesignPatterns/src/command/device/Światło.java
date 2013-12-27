package command.device;

public class Światło {

	private String nazwa = "";
	
	public Światło(String nazwa){
		this.nazwa = nazwa;
	}
	
	public Światło() {
	}

	public void włącz(){
		System.out.println(nazwa + " światło zostało włączone!");
	}
	
	public void wyłącz(){
		System.out.println(nazwa + " światło zostało wyłączone!");
	}
}
