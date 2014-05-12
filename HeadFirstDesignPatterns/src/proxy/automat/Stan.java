package proxy.automat;

import java.io.Serializable;
import java.rmi.RemoteException;

public interface Stan extends Serializable {
	
	void włóżMonetę();

	void zwróćMonetę();

	void przekręćGałkę();

	void wydaj() throws RemoteException;
}
