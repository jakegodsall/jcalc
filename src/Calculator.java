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

    Font myFont = new Font("Ink Free", Font.BOLD, 20);

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

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;
        operationButtons[4] = decButton;
        operationButtons[5] = eqButton;
        operationButtons[6] = delButton;
        operationButtons[7] = clrButton;

        for (JButton operationButton : operationButtons) {
            operationButton.addActionListener(this);
            operationButton.setFont(myFont);
            operationButton.setFocusable(false);
        }

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        frame.add(textField);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
