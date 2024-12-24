package GUI;

// import java.util.FormatFlagsConversionMismatchException;
import java.awt.*;

public class AWTExample2{
    AWTExample2(){
        Frame f = new Frame();
        Label l = new Label("Employee id:");
        Button b = new Button("Click Me!");
        TextField t = new TextField();
        
        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 50);
        b.setBounds(100, 100, 80, 30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setSize(300,400);

        f.setTitle("Employee Info");

        f.setLayout(null);

        f.setVisible(true);
    }
    public static void main(String[] args) {
        AWTExample2 awt = new AWTExample2();
        
    }

}
