package proxy.helloworld;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import proxy.helloworld.Zdalny;

public class ZdalnyImpl extends UnicastRemoteObject implements Zdalny {

	private static final long serialVersionUID = 5392839296371000920L;

	public ZdalnyImpl() throws RemoteException {
	} 

	@Override
	public String powiedzHej() throws RemoteException {
		return "Serwer mówi 'Hej'";
	}

	public static void main(String[] args) {
		try {
			Zdalny usługa = new ZdalnyImpl();
			Naming.rebind("ZdalnyHej", usługa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
