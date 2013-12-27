package command.device;

public class WieżaStereo {

	public void włącz(){
		System.out.println("Wieża stereo włączona");
	}
	
	public void wyłącz(){
		System.out.println("Wieża stereo wyłączona");
	}
	
	public void ustawCD(){
		System.out.println("Wieża stereo - CD");
	}
	
	public void ustawGłośność(int wartość){
		System.out.println("Wieża stereo - głośność: " + wartość);
	}
	
}
