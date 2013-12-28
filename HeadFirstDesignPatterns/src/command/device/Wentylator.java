package command.device;

public class Wentylator {

	public enum PRĘDKOŚĆ{
		SZYBKO, ŚREDNIO, WOLNO, WYŁĄCZ
	}
	private PRĘDKOŚĆ prędkość;
	
	public Wentylator(){
		prędkość = PRĘDKOŚĆ.WYŁĄCZ;
	}
	
	public void wysokieObroty(){
		prędkość = PRĘDKOŚĆ.SZYBKO;
		System.out.println("Wentylator włączony, wysokie obroty ");
	}
	
	public void średnieObroty(){
		prędkość = PRĘDKOŚĆ.ŚREDNIO;
		System.out.println("Wentylator włączony, średnie obroty ");
	}
	
	public void niskieObroty(){
		prędkość = PRĘDKOŚĆ.WOLNO;
		System.out.println("Wentylator włączony, niskie obroty ");
	}
	
	public void wyłącz(){
		prędkość = PRĘDKOŚĆ.WYŁĄCZ;
		System.out.println("Wentylator wyłączony");
	}
	
	public PRĘDKOŚĆ pobierzPrędkość(){
		return prędkość;
	}

	@Override
	public String toString() {
		return "Wentylator [prędkość=" + prędkość + "]";
	}
	
	
}
