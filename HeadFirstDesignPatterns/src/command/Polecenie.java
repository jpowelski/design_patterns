package command;

/**
 * Hermetyzuje żądanie w postaci obiektów, co umożliwia parametryzowanie różnych
 * obiektów zróżnicowanymi żądaniami (takimi jak np. żądania kolejkowania lub
 * rejestracji) oraz obsługiwanie operacji, które można wycofać.
 * 
 * @author galica
 * 
 */
public interface Polecenie {

	public void wykonaj();

	public void wycofaj();
}
