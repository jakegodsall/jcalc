import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] operationButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, eqButton, delButton, clrButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    int FRAME_WIDTH = 420;
    int FRAME_HEIGHT = 550;
    double num1 = 0;
    double num2 =  0;
    double result = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, (int) (0.71 * FRAME_WIDTH), FRAME_HEIGHT / 11);
        textField.setFont(myFont);
        textField.setEditable(false);

        frame.add(textField);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
