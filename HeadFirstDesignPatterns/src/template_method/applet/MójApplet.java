package template_method.applet;

import java.applet.Applet;
import java.awt.Graphics;

public class MójApplet extends Applet {

	private static final long serialVersionUID = -5290032611684151460L;
	
	private String komunikat;
	
	public void init(){
		komunikat = "Witaj";
		repaint();
	}
	
	public void start(){
		komunikat = "Uruchamiam się...";
		repaint();
	}
	
	public void stop(){
		komunikat = "Zostałem zatrzymany";
		repaint();
	}
	
	public void destroy(){
		komunikat = "Autodestrukcja za 0 sekund";
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(komunikat, 9, 15);
	}
}
