package decorator;

public class StarCafe {

	public static void main(String[] args) {
		Napój napój = new Espresso();
		System.out.println(napój.pobierzOpis() + " " + napój.koszt() + " zł");
		
		Napój napój2 = new MocnaPalona();
		napój2 = new Czekolada(napój2);
		napój2 = new Czekolada(napój2);
		napój2 = new BitaŚmietana(napój2);
		System.out.println(napój2.pobierzOpis() + " " + napój2.koszt() + " zł");
		
		Napój napój3 = new StarCafeSpecial();
		napój3 = new MleczkoSojowe(napój3);
		napój3 = new Czekolada(napój3);
		napój3 = new BitaŚmietana(napój3);
		System.out.println(napój3.pobierzOpis() + " " + napój3.koszt() + " zł");
	}
}
