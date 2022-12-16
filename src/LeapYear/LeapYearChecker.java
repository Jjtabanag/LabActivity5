package LeapYear;

import javax.swing.*;

public class LeapYearChecker extends JFrame {
    private JPanel jpanel;
    private JTextField textField1;
    private JButton checkButton;

    public LeapYearChecker() {

    }

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setSize(550,600);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}


