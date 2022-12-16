package SimpleCalc;

import javax.swing.*;

public class SimpleCalculator extends JFrame {
    private JPanel jpanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalculator() {

    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setTitle("Simple Calculator");
        app.setSize(600, 500);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
