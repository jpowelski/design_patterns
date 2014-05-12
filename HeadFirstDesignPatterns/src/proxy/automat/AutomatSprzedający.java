package proxy.automat;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AutomatSprzedający extends UnicastRemoteObject implements
		AutomatSprzedającyZdalny {

	private Stan stanBrakGum;
	private Stan stanNieMaMonety;
	private Stan stanJestMoneta;
	private Stan stanGumaSprzedana;
	private Stan stanWygrana;

	private Stan stan = stanBrakGum;
	private int liczba = 0;

	public AutomatSprzedający(int liczba) throws RemoteException{
		stanBrakGum = new StanBrakGum(this);
		stanNieMaMonety = new StanNieMaMonety(this);
		stanJestMoneta = new StanJestMoneta(this);
		stanGumaSprzedana = new StanGumaSprzedana(this);
		stanWygrana = new StanWygrana(this);

		this.liczba = liczba;
		if (liczba > 0) {
			stan = stanNieMaMonety;
		}
	}

	public void włóżMonetę() {
		stan.włóżMonetę();
	}

	public void zwróćMonetę() {
		stan.zwróćMonetę();
	}

	public void przekręćGałkę() throws RemoteException {
		stan.przekręćGałkę();
		stan.wydaj();
	}

	public void ustawStan(Stan stan) {
		this.stan = stan;
	}

	public Stan pobierzStanBrakGum() {
		return stanBrakGum;
	}

	public Stan pobierzStanNieMaMonety() {
		return stanNieMaMonety;
	}

	public Stan pobierzStanJestMoneta() {
		return stanJestMoneta;
	}

	public Stan pobierzStanGumaSprzedana() {
		return stanGumaSprzedana;
	}

	public Stan pobierzStanWygrana() {
		return stanWygrana;
	}

	void zwolnijGume() {
		System.out.println("Wypada guma...");
		if (liczba != 0) {
			liczba--;
		}
	}

	@Override
	public String toString() {
		String result = "\nAutomatSprzedający [zapas=" + liczba + "]\n";
		if (stan == stanBrakGum) {
			result += "Automat jest pusty";
		} else if (stan == stanNieMaMonety) {
			result += "Automat oczekuje na monetę";
		} else if (stan == stanJestMoneta) {
			result += "Moneta w automacie";
		} else if (stan == stanGumaSprzedana) {
			result += "Wydawanie gumy";
		}

		return result + "\n";
	}
	
	@Override
	public int pobierzLiczba() throws RemoteException {
		return 0;
	}

	@Override
	public String pobierzLokalizacja() throws RemoteException {
		return null;
	}

	@Override
	public Stan pobierzStan() throws RemoteException {
		return null;
	}

}
