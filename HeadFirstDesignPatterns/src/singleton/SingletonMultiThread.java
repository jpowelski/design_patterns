package singleton;

public class SingletonMultiThread {

	private static volatile SingletonMultiThread singleton;
	
	private SingletonMultiThread(){
	}
	
	public static SingletonMultiThread getInstance(){
		if (singleton == null){
			synchronized (SingletonMultiThread.class) {
				if (singleton == null){
					singleton = new SingletonMultiThread();
				}
			}
		}
		return singleton;
	}
}
