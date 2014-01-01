package iterator.composite;

import java.util.ArrayList;

public class Menu extends MenuSkładnik {

	private ArrayList<MenuSkładnik> menuSkładniki = new ArrayList<>();
	
	public Menu(String nazwa, String opis) {
		super(nazwa, opis);
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
	
	public void drukuj(){
		System.out.print("\n" + pobierzNazwa());
		System.out.println(", " + pobierzOpis());
		System.out.println("-------------------");
		
		for(MenuSkładnik m : menuSkładniki){
			m.drukuj();
		}
	}
}
