import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class currencyConvert{
    public static void Converter() {
        JFrame f = new JFrame("CONVERTER");

        JLabel l1, l2;
        JTextField t1, t2;
        JButton b1, b2, b3;

        l1 = new JLabel("Rupees");
        l1.setBounds(20,40,60,30);
        l2 = new JLabel("Dollar");
        l2.setBounds(170, 40, 60, 30);

        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);

        b1 = new JButton("INR");
        b1.setBounds(50, 80, 100,15);
        b2 = new JButton("Dollar");
        b2.setBounds(180, 80, 100, 15);
        b3 = new JButton("Close");
        b3.setBounds(145, 150, 100, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d = Double.parseDouble(t1.getText());
                double d1 = (d/80.00);

                String str1 = String.valueOf(d1);
                t2.setText(str1);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d2 = Double.parseDouble(t2.getText());
                double d3 = (d2*80.00);
                
                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                f.dispose();
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Converter();
    }
}