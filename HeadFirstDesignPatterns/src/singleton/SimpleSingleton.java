package singleton;

public class SimpleSingleton {

	private static SimpleSingleton singleton;
	
	private SimpleSingleton(){
	}
	
	public static SimpleSingleton getInstance(){
		if (singleton == null){
			singleton = new SimpleSingleton();
		}
		return singleton;
	}
}
