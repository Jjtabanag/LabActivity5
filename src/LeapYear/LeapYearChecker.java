package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class LeapYearChecker extends JFrame {
    private JPanel jpanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearChecker() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText());
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
                } else {
                    JOptionPane.showMessageDialog(null, "Not a Leap Year");
                }

            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setSize(500,500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}


