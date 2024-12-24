package GUI.label_gui;

import java.awt.*;

public class LabelExample {
    public static void main(String Args[]){
        Frame f = new Frame("Frame example");
        Label l1, l2;

        l1 = new Label("First label.");
        l2 = new Label("Second label.");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);

        f.add(l1);
        f.add(l2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
