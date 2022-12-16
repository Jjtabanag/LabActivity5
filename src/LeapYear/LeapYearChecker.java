package LeapYear;

import javax.swing.*;

public class LeapYearChecker {
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;
}


//try {
//        int ctr = 0;
//        for (JCheckBox cb : foods) {
//        if (cb.isSelected()) {
//        double price = Double.parseDouble(cb.getName());
//        total += price;
//        ctr++;
//        }
//        }
//        if (ctr == 0) {
//        throw new Exception("No food option selected.");
//        }
//        double discount = 0;
//        if (rb5.isSelected()) {
//        discount = total * .05;
//        total -= discount;
//        } else if (rb10.isSelected()) {
//        discount = total * .1;
//        total -= discount;
//        } else if (rb15.isSelected()) {
//        discount = total * .15;
//        total -= discount;
//        } else if (rbNone.isSelected()) {
//        discount = 0;
//        } else {
//        throw new Exception("No discount option selected.");
//        }
//
//        for (JCheckBox cb : foods) {
//        if (cb.isSelected()) {
//        double price = Double.parseDouble(cb.getName());
//        System.out.println(cb.getText() + ": Php " + df.format(price));
//        }
//        }
//        System.out.println("Discount: Php " + df.format(discount));
//        System.out.println("Total: Php " + df.format(total) + "\n");
//        JOptionPane.showMessageDialog(null, "The total price is Php " + df.format(total));
//        } catch (Exception ex) {
//        JOptionPane.showMessageDialog(null, ex.getMessage());
//        System.out.println(ex.getMessage());
//        }