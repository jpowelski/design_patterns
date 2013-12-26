package decorator;

public class StarCafe {

	public static void main(String[] args) {
		Nap�j nap�j = new Espresso();
		System.out.println(nap�j.pobierzOpis() + " " + nap�j.koszt() + " z�");
		
		Nap�j nap�j2 = new MocnaPalona();
		nap�j2 = new Czekolada(nap�j2);
		nap�j2 = new Czekolada(nap�j2);
		nap�j2 = new Bita�mietana(nap�j2);
		System.out.println(nap�j2.pobierzOpis() + " " + nap�j2.koszt() + " z�");
		
		Nap�j nap�j3 = new StarCafeSpecial();
		nap�j3 = new MleczkoSojowe(nap�j3);
		nap�j3 = new Czekolada(nap�j3);
		nap�j3 = new Bita�mietana(nap�j3);
		System.out.println(nap�j3.pobierzOpis() + " " + nap�j3.koszt() + " z�");
	}
}
