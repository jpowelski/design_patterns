package facade.hifi;

public class FasadaKinaDomowegoTest {
	public static void main(String[] args) {
		FasadaKinaDomowego fasadaKinaDomowego = new FasadaKinaDomowego(
				new Wzmacniacz(), new OdtwarzaczDVD(), new OdtwarzaczCD(),
				new Projektor(), new OświetlenieKinowe(), new Ekran(),
				new MaszynkaPopcorn());
		fasadaKinaDomowego.odtwarzanieFilmu("Indiana Jones");
		fasadaKinaDomowego.koniecFilmu();
	}
}
