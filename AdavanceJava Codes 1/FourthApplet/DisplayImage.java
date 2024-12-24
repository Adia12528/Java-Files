package FourthApplet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DisplayImage extends Applet{
	Image picture;
	public void init() {
		picture = getImage(getDocumentBase(),"aiming.png");
	}
	public void paint(Graphics g) {
		g.drawImage(picture, 30, 30, 300, 300, this);
	}
}