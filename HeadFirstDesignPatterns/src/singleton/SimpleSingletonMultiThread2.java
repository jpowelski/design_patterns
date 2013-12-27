package singleton;


public class SimpleSingletonMultiThread2 {

	private static SimpleSingletonMultiThread2 singleton;
	
	private SimpleSingletonMultiThread2(){
	}
	
	public static synchronized SimpleSingletonMultiThread2 getInstance(){
		if (singleton == null){
			singleton = new SimpleSingletonMultiThread2();
		}
		return singleton;
	}
}

