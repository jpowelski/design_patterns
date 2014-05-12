package proxy.automat;

import java.rmi.RemoteException;

public class StanWygrana implements Stan {

	private transient AutomatSprzedający automat;

	public StanWygrana(AutomatSprzedający automatSprzedający) {
		this.automat = automatSprzedający;
	}

	@Override
	public void włóżMonetę() {
		System.out.println("Proszę czekać na gumę");
	}

	@Override
	public void zwróćMonetę() {
		System.out.println("Niestety, nie można zwrócić monety po przekręceniu gałki");
	}

	@Override
	public void przekręćGałkę() {
		System.out.println("Nie dostaniesz gumy tylko dlatego bo przekręciłeś drugi raz");
	}

	@Override
	public void wydaj() throws RemoteException {
		System.out.println("WYGRAŁEŚ! Dostajesz drugą gumę");
		automat.zwolnijGume();
		if (automat.pobierzLiczba() == 0){
			automat.ustawStan(automat.pobierzStanBrakGum());
		} else{
			if (automat.pobierzLiczba() > 0){
				automat.ustawStan(automat.pobierzStanNieMaMonety());
			} else{
				System.out.println("ups, koniec gum");
				automat.ustawStan(automat.pobierzStanBrakGum());
			}
		}
	}

}
