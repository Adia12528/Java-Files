import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelChanger {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Label Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create a label with initial text
        JLabel label = new JLabel("Value 1");
        label.setBounds(100, 50, 100, 30);
        
        // Create a button
        JButton button = new JButton("Start");
        button.setBounds(100, 100, 150, 30);
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            private boolean toggle = true;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggle) {
                    label.setText("Value 2");
                } else {
                    label.setText("Value 1");
                }
                toggle = !toggle;
            }
        });
        
        // Add components to the frame
        frame.setLayout(null);
        frame.add(label);
        frame.add(button);
        
        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
