import java.awt.*;
import java.awt.event.*;

public class SimpleEventDemo extends Frame implements ActionListener {
    TextField textField;

    public SimpleEventDemo() {
        // Create components
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        Button button = new Button("Click Me");
        button.setBounds(100, 120, 80, 30);

        // Register listener
        button.addActionListener(this);

        // Add components and set frame properties
        add(button);
        add(textField);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    // Implement the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        textField.setText("Welcome!");
    }

    public static void main(String[] args) {
        new SimpleEventDemo();
    }
}

