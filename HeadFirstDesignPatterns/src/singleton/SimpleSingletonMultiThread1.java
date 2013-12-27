package singleton;

public class SimpleSingletonMultiThread1 {

	private static SimpleSingletonMultiThread1 singleton = new SimpleSingletonMultiThread1();
	
	private SimpleSingletonMultiThread1(){
	}
	
	public static SimpleSingletonMultiThread1 getInstance(){
		return singleton;
	}
}
