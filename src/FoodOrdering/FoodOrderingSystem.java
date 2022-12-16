package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FoodOrderingSystem extends JFrame {
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public FoodOrderingSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                List<JCheckBox> foods = new ArrayList<>();
                foods.add(cPizza);
                foods.add(cBurger);
                foods.add(cFries);
                foods.add(cSoftDrinks);
                foods.add(cTea);
                foods.add(cSundae);

                int ctr = 0;
                for (JCheckBox cb : foods) {
                    if (cb.isSelected()) {
                        double price = Double.parseDouble(cb.getName());
                        total += price;
                        ctr++;
                    }
                }

                double discount = 0;
                if (rb5.isSelected()) {
                    discount = total * .05;
                    total -= discount;
                } else if (rb10.isSelected()) {
                    discount = total * .1;
                    total -= discount;
                } else if (rb15.isSelected()) {
                    discount = total * .15;
                    total -= discount;
                } else if (rbNone.isSelected()) {
                    discount = 0;
                }

                for (JCheckBox cb : foods) {
                    if (cb.isSelected()) {
                        double price = Double.parseDouble(cb.getName());
                        System.out.println(cb.getText() + ": Php " + df.format(price));
                    }
                }
                System.out.println("Discount: Php " + df.format(discount));
                System.out.println("Total: Php " + df.format(total) + "\n");
                JOptionPane.showMessageDialog(null, "The total price is Php " + df.format(total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(600,700);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
