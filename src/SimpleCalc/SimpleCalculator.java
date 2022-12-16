package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SimpleCalculator extends JFrame {
    private JPanel jpanel;
    private JComboBox<String> cbOperations;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JTextField lblResult;
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public SimpleCalculator() {
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String str1 = tfNumber1.getText();
                    String str2 = tfNumber2.getText();

                    if (str1.isBlank() || str2.isBlank()) {
                        throw new Exception("Missing Input");
                    }

                    double n1 = Double.parseDouble(str1), n2 = Double.parseDouble(str2);
                    double result = 0;

                    if (n2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }

                    Object selectedItem = cbOperations.getSelectedItem();
                    if ("+".equals(selectedItem)) {
                        result = n1 + n2;
                    } else if ("-".equals(selectedItem)) {
                        result = n1 - n2;
                    } else if ("*".equals(selectedItem)) {
                        result = n1 * n2;
                    } else if ("/".equals(selectedItem)) {
                        result = n1 / n2;
                    }

                    String r = df.format(result);
                    lblResult.setText(new BigDecimal(r).stripTrailingZeros().toPlainString());
                    System.out.println(new BigDecimal(str1).stripTrailingZeros().toPlainString() + " " + selectedItem + " " + new BigDecimal(str2).stripTrailingZeros().toPlainString() + " = " + r);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                    System.out.println("Invalid Input");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    System.out.println(ex.getMessage());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setTitle("Simple Calculator");
        app.setSize(630, 600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
