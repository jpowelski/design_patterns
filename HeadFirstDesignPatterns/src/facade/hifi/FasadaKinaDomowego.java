package facade.hifi;

public class FasadaKinaDomowego {

	private Wzmacniacz wzmacniacz;
	private OdtwarzaczDVD odtwarzaczDVD;
	private OdtwarzaczCD odtwarzaczCD;
	private Projektor projektor;
	private OświetlenieKinowe oświetlenieKinowe;
	private Ekran ekran;
	private MaszynkaPopcorn popcorn;

	public FasadaKinaDomowego(Wzmacniacz wzmacniacz,
			OdtwarzaczDVD odtwarzaczDVD, OdtwarzaczCD odtwarzaczCD,
			Projektor projektor, OświetlenieKinowe oświetlenieKinowe,
			Ekran ekran, MaszynkaPopcorn maszynkaPopcorn) {
		this.wzmacniacz = wzmacniacz;
		this.odtwarzaczDVD = odtwarzaczDVD;
		this.odtwarzaczCD = odtwarzaczCD;
		this.projektor = projektor;
		this.oświetlenieKinowe = oświetlenieKinowe;
		this.ekran = ekran;
		this.popcorn = maszynkaPopcorn;
	}

	public void odtwarzanieFilmu(String film) {
		System.out.println("\n----- Przygotuj się na film ----");

		popcorn.włącz();
		popcorn.przygotujPopcorn();

		oświetlenieKinowe.ściemniaj(10);

		ekran.wDół();

		projektor.włącz();
		projektor.trybSzerokoekranowy();

		wzmacniacz.włącz();
		wzmacniacz.ustawDVD();
		wzmacniacz.ustawDźwiękPrzestrzenny();
		wzmacniacz.ustawGłośność(5);

		odtwarzaczDVD.włącz();
		odtwarzaczDVD.odtwarzaj(film);
	}
	
	public void koniecFilmu(){
		System.out.println("\n----- Koniec filmu, wyłączam kino domowe ----");

		popcorn.wyłącz();
		
		oświetlenieKinowe.wyłącz();
		
		ekran.wGórę();
		
		projektor.wyłącz();
		
		wzmacniacz.wyłącz();
		
		odtwarzaczDVD.zatrzymaj();
		odtwarzaczDVD.wysuńDysk();
		odtwarzaczDVD.wyłącz();
	}

}
