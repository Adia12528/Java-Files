import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel fromLabel = new JLabel("From:");
        fromLabel.setBounds(50, 50, 100, 30);
        frame.add(fromLabel);

        JComboBox<String> fromCurrency = new JComboBox<>(new String[]{"USD", "INR"});
        fromCurrency.setBounds(150, 50, 100, 30);
        frame.add(fromCurrency);

        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(50, 100, 100, 30);
        frame.add(toLabel);

        JComboBox<String> toCurrency = new JComboBox<>(new String[]{"USD", "INR"});
        toCurrency.setBounds(150, 100, 100, 30);
        frame.add(toCurrency);

        JTextField amountField = new JTextField();
        amountField.setBounds(50, 150, 200, 30);
        frame.add(amountField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(150, 200, 100, 30);
        frame.add(convertButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(50, 250, 300, 30);
        frame.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String from = (String) fromCurrency.getSelectedItem();
                String to = (String) toCurrency.getSelectedItem();
                double amount = Double.parseDouble(amountField.getText());
                double result = convertCurrency(from, to, amount);
                resultLabel.setText("Result: " + result);
            }
        });

        frame.setVisible(true);
    }

    public static double convertCurrency(String from, String to, double amount) {
        double rate = 1.0;
        if (from.equals("USD") && to.equals("INR")) {
            rate = 74.85; // Example rate
        } else if (from.equals("INR") && to.equals("USD")) {
            rate = 1 / 74.85;
        }
        return amount * rate;
    }
}
