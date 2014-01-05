package proxy.helloworld;

import java.rmi.Naming;
import java.security.Permission;

public class ZdalnyKlient {

	public static void main(String[] args) {
		new ZdalnyKlient().go();
	}

	public void go() {
		try {
			Zdalny usługa = (Zdalny) Naming.lookup("rmi://127.0.0.1/ZdalnyHej");

			String s = usługa.powiedzHej();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}