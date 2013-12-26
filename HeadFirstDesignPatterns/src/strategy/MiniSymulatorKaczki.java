package strategy;

public class MiniSymulatorKaczki {

	public static void main(String[] args) {
		Kaczka dzika = new DzikaKaczka();
		dzika.wykonajKwacz();
		dzika.wykonajLot();
		dzika.wy�wietl();
		
		System.out.println();
		
		Kaczka model = new ModelKaczki();
		model.wykonajLot();
		model.setLatanie(new LotZNap�demRakietowym());
		model.wykonajLot();
	}

}
