package proxy.automat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AutomatSprzedającyZdalny extends Remote {
	int pobierzLiczba() throws RemoteException;
	String pobierzLokalizacja() throws RemoteException;
	Stan pobierzStan() throws RemoteException;
}
