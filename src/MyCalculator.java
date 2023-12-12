import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyCalculator extends JFrame {

    static public JButton numberButton = new JButton("0");
    static public JButton numberButton1 = new JButton("1");
    static public JButton numberButton2 = new JButton("2");
    static public JButton numberButton3 = new JButton("3");
    static public JButton numberButton4 = new JButton("4");
    static public JButton numberButton5 = new JButton("5");
    static public JButton numberButton6 = new JButton("6");
    static public JButton numberButton7 = new JButton("7");
    static public JButton numberButton8 = new JButton("8");
    static public JButton numberButton9 = new JButton("9");

    static public double answerDouble = 0.0;
    static public boolean equalsClicked = false, opChosen = false;
    static char operationChar = ' ';

    static public String tempString1, tempString2, answerString;

    static public JButton signEquals = new JButton("=");
    static public JButton plusButton = new JButton("+");
    static public JButton minusButton = new JButton("-");
    static public JButton divisionButton = new JButton("/");
    static public JButton multiplicationButton = new JButton("*");
    static public JButton decimalButton = new JButton(".");
    static public JButton negativeButton = new JButton("+/-");
    static public JButton resetButton = new JButton("C");
    static public JButton backSpaceButton = new JButton("Back");

    static public JTextArea outputTextArea = new JTextArea(3, 16);

    public JPanel mainPanel = new JPanel();
    public JPanel topPanel = new JPanel(new GridBagLayout());
    public JPanel centerPanel = new JPanel(new GridBagLayout());

    public static void main(String[] args) {
        MyCalculator basicGUI = new MyCalculator();
        basicGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        basicGUI.setVisible(false);

        Numbers n = new Numbers();
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Calculation c = new Calculation();
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);

        n.setVisible(false);

        numberButton.addActionListener(n);
        numberButton1.addActionListener(n);
        numberButton2.addActionListener(n);
        numberButton3.addActionListener(n);
        numberButton4.addActionListener(n);
        numberButton5.addActionListener(n);
        numberButton6.addActionListener(n);
        numberButton7.addActionListener(n);
        numberButton8.addActionListener(n);
        numberButton9.addActionListener(n);
        decimalButton.addActionListener(n);
        negativeButton.addActionListener(n);
        backSpaceButton.addActionListener(n);

        signEquals.addActionListener(c);
        plusButton.addActionListener(c);
        divisionButton.addActionListener(c);
        multiplicationButton.addActionListener(c);
        resetButton.addActionListener(c);
        minusButton.addActionListener(c);
    }

    public MyCalculator() {
        super("Calculator Project");
        designClass();
        setSize(260, 275);
        setResizable(false);
        setVisible(true);
    }

    public void designClass() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        this.add(mainPanel);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        gbc.gridx = 0;
        gbc.gridy = 0;
        outputTextArea.setEditable(false);
        topPanel.add(outputTextArea, gbc);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        gbc.gridx = 1;
        gbc.gridy = 1;
        centerPanel.add(numberButton7, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        centerPanel.add(numberButton8, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        centerPanel.add(numberButton9, gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        centerPanel.add(resetButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        centerPanel.add(numberButton4, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        centerPanel.add(numberButton5, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        centerPanel.add(numberButton6, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        centerPanel.add(multiplicationButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        centerPanel.add(numberButton1, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        centerPanel.add(numberButton2, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        centerPanel.add(numberButton3, gbc);

        gbc.gridx = 4;
        gbc.gridy = 3;
        centerPanel.add(minusButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        centerPanel.add(numberButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        centerPanel.add(divisionButton, gbc);

        gbc.gridx = 3;
        gbc.gridy = 4;
        centerPanel.add(plusButton, gbc);

        gbc.gridx = 4;
        gbc.gridy = 4;
        centerPanel.add(decimalButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 5;
        centerPanel.add(backSpaceButton, gbc);

        gbc.gridx = 3;
        gbc.gridy = 5;
        centerPanel.add(negativeButton, gbc);

        gbc.gridx = 4;
        gbc.gridy = 5;
        centerPanel.add(signEquals, gbc);
    }
}
