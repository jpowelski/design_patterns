package iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuSkładnik {

	private ArrayList<MenuSkładnik> menuSkładniki = new ArrayList<>();
	private String nazwa;
	private String opis;
	
	public Menu(String nazwa, String opis) {
		this.nazwa = nazwa;
		this.opis = opis;
	}

	public void dodaj(MenuSkładnik menuSkładnik){
		menuSkładniki.add(menuSkładnik);
	}
	
	public void usuń(MenuSkładnik menuSkładnik){
		menuSkładniki.remove(menuSkładnik);
	}
	
	public MenuSkładnik pobierzPotomek(int i){
		return menuSkładniki.get(i);
	}
	
	public String pobierzNazwa(){
		return nazwa;
	}
	
	public String pobierzOpis(){
		return opis;
	}
	
	public void drukuj(){
		System.out.print("\n" + pobierzNazwa());
		System.out.println(", " + pobierzOpis());
		System.out.println("-------------------");
		
		for(MenuSkładnik m : menuSkładniki){
			m.drukuj();
		}
	}
}
