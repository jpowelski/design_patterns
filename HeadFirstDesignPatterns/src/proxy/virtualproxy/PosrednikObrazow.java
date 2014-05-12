package proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PosrednikObrazow implements Icon {

	ImageIcon imageIcon;
	URL obrazekUrl;
	Thread pobieranieThread;
	boolean pobieranie = false;

	public PosrednikObrazow(URL pobierzUrlCD) {
		obrazekUrl = pobierzUrlCD;
	}

	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}
		return 600;
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}
		return 800;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Trwa ładowanie okładki, proszę czekać...", x + 300,
					y + 190);
			if (!pobieranie){
				pobieranie = true;
				
				pobieranieThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try{
							imageIcon = new ImageIcon(obrazekUrl, "Okładka CD");
							c.repaint();
						} catch(Exception e){
							e.printStackTrace();
						}
					}
				});
				pobieranieThread.start();
			}
		}
	}

}
