import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT_Example {
    public static void main(String[] args)
    {
        Frame f = new Frame("Basic Program");
        Label l = new Label("Hello World!");

        l.setAlignment(Label.CENTER);
        f.add(l);
        f.setSize(300, 300);

        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}

