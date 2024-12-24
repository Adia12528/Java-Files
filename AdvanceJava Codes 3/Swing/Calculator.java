import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

    private JTextField textField;

    private double number1, number2, result;
    private char operation;

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        add(panel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/",
                            "4", "5", "6", "*",
                            "1", "2", "3", "-",
                            "0", ".", "=", "+"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(new ButtonListener());
            panel.add(jButton);
        }

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    textField.setText(textField.getText() + command);
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    number1 = Double.parseDouble(textField.getText());
                    operation = command.charAt(0);
                    textField.setText("");
                    break;
                case "=":
                    number2 = Double.parseDouble(textField.getText());
                    switch (operation) {
                        case '+':
                            result = number1 + number2;
                            break;
                        case '-':
                            result = number1 - number2;
                            break;
                        case '*':
                            result = number1 * number2;
                            break;
                        case '/':
                            result = number1 / number2;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    break;
                case ".":
                    if (!textField.getText().contains(".")) {
                        textField.setText(textField.getText() + ".");
                    }
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}