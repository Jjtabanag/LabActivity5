package LeapYear;

import javax.swing.*;
import java.awt.event.*;

public class LeapYearChecker extends JFrame {
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new CheckButton());
        tfYear.addKeyListener(new CheckButton());
    }

    public static void main(String[] args) {

        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setTitle("Leap Year Checker");
        app.setSize(500,500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);

    }

    public class CheckButton implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String str = tfYear.getText();
                char[] c = str.toCharArray();
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isDigit(c[i])) {
                        throw new NumberFormatException("Invalid Input");
                    }
                }
                int year = Integer.parseInt(str);
                Boolean leap;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    }
                    else
                        leap = true;
                }
                else
                    leap = false;

                if (leap) {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                    System.out.println(year + " is a Leap Year");
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                    System.out.println(year + " is not a Leap Year");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                try {
                    String str = tfYear.getText();
                    char[] c = str.toCharArray();
                    for (int i = 0; i < str.length(); i++) {
                        if (!Character.isDigit(c[i])) {
                            throw new NumberFormatException("Invalid Input");
                        }
                    }
                    int year = Integer.parseInt(str);
                    Boolean leap;
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0)
                                leap = true;
                            else
                                leap = false;
                        }
                        else
                            leap = true;
                    }
                    else
                        leap = false;

                    if (leap) {
                        JOptionPane.showMessageDialog(null, "Leap Year");
                        System.out.println(year + " is a Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a Leap Year");
                        System.out.println(year + " is not a Leap Year");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}


