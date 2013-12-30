package template_method.frame;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MojaRamka extends JFrame {

	public MojaRamka(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(450, 200);
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		String msg = "Teraz to jest moja ramka";
		g.drawString(msg, 150, 100);
	}

	public static void main(String[] args) {
		new MojaRamka(
				"Wzorce projektowe - metoda szablonowa.");
	}
}
