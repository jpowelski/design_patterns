package proxy.virtualproxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class PosrednikObrazkowTest {

	ImageComponent imageComponent;
	JFrame frame = new JFrame("Przeglądarka płyt CD");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> dyski = new Hashtable<>();

	public static void main(String[] args) throws Exception {
		PosrednikObrazkowTest test = new PosrednikObrazkowTest();
	
	}

	public PosrednikObrazkowTest() throws Exception {
		dyski.put(
				"Ambient: Music for Airports",
				"http://upload.wikimedia.org/wikipedia/en/thumb/4/46/Music_for_Airports.jpg/220px-Music_for_Airports.jpg");
		dyski.put("Buddha Bar",
				"http://i619.photobucket.com/albums/tt277/faheemjp/BuddhaBar-I.jpg");
		dyski.put("Ima",
				"http://www.renaud-bray.com/ImagesEditeurs/PG/994/994486-gf.jpg");
		dyski.put("Karma",
				"http://www.edrants.com/wp-content/uploads/2008/02/karma.gif");
		dyski.put(
				"MCMXC A.D.",
				"https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSOInfG70B6QWhQ8-wXShAMETXX7Rto-5RmJOO_8MWY3J_5fv14fH2QMO12qA");
		dyski.put("Northern Exposure",
				"http://www.retroweb.com/nexp/nexp_cast.jpg");
		dyski.put(
				"Selected Ambient Works",
				"http://upload.wikimedia.org/wikipedia/en/d/d9/Selected_ambient_works_85-92.jpg");

		URL startUrl = new URL(dyski.get("Selected Ambient Works"));
		menuBar = new JMenuBar();
		menu = new JMenu("Ulubione CD");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration<String> e = dyski.keys(); e.hasMoreElements();) {
			String nazwa = e.nextElement();
			JMenuItem menuItem = new JMenuItem(nazwa);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent event) {
					imageComponent.setIcon(new PosrednikObrazow(
							pobierzUrlCD(event.getActionCommand())));
					frame.repaint();
				}

			});
		}
		
		Icon icon = new PosrednikObrazow(startUrl);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}

	private URL pobierzUrlCD(String nazwa) {
		try {
			return new URL(dyski.get(nazwa));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
