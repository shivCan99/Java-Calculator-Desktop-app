import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Calculation extends Numbers implements ActionListener {

    private static final long serialVersionUID = 1L;

    public void actionPerformed(ActionEvent evt) {
        JButton scr = (JButton) evt.getSource();

        if (scr.equals(plusButton)) {
            if (tempString1 == null) {
                System.out.println("Choose your numbers First!");
            } else if (tempString1 != null && tempString2 == null) {
                opChosen = true;
                operationChar = '+';
            } else if (tempString1 != null && tempString2 != null) {
                System.out.println("Two operation only!");
            }
        }

        if (scr.equals(minusButton)) {
            if (tempString1 == null) {
                System.out.println("Choose your numbers First!");
            } else if (tempString1 != null && tempString2 == null) {
                opChosen = true;
                operationChar = '-';
            } else if (tempString1 != null && tempString2 != null) {
                System.out.println("Two operation only!");
            }
        }
        if (scr.equals(multiplicationButton)) {
            if (tempString1 == null) {
                System.out.println("Choose your numbers First!");
            } else if (tempString1 != null && tempString2 == null) {
                opChosen = true;
                operationChar = '*';
            } else if (tempString1 != null && tempString2 != null) {
                System.out.println("Two operation only!");
            }
        }
        if (scr.equals(divisionButton)) {
            if (tempString1 == null) {
                System.out.println("Choose your numbers First!");
            } else if (tempString1 != null && tempString2 == null) {
                opChosen = true;
                operationChar = '/';
            } else if (tempString1 != null && tempString2 != null) {
                System.out.println("Two operation only!");
            }
        }

        if (scr.equals(signEquals)) {
            if (tempString1 == null) {
                System.out.println("Choose your numbers First!");
            } else if (tempString1 != null && tempString2 == null) {
                System.out.println("Choose BOTH numbers First!");
            }

            if (tempString1 != null && tempString2 != null) {
                double d1 = 0.0, d2 = 0.0;

                d1 = Double.parseDouble(tempString1);
                d2 = Double.parseDouble(tempString2);

                switch (operationChar) {
                    case '+':
                        answerDouble = d1 + d2;
                        break;
                    case '-':
                        answerDouble = d1 - d2;
                        break;
                    case '*':
                        answerDouble = d1 * d2;
                        break;
                    case '/':
                        answerDouble = d1 / d2;
                        break;
                }
                answerString = Double.toString(answerDouble);
                outputTextArea.setText(answerString);
                if (operationChar == '/' && d2 == 0.0) {
                    outputTextArea.setText("DIVIDE BY 0 ERROR");
                }
            }
        }

        if (scr.equals(resetButton)) {
            tempString1 = null;
            tempString2 = null;
            equalsClicked = false;
            opChosen = false;
            operationChar = ' ';
            answerString = null;
            outputTextArea.setText(null);
        }
    }
}
