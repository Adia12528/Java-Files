package FirstApplet;
import java.applet.Applet;
import java.awt.Graphics;

public class First extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Java Applet!", 20, 20);
    }
}