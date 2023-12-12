import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Numbers extends MyCalculator implements ActionListener {

    public void actionPerformed(ActionEvent event) {
        JButton scr = (JButton) event.getSource();

        if (scr.equals(numberButton1)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "1";
                } else {
                    tempString1 = tempString1 + "1";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "1";
                } else {
                    tempString2 = tempString2 + "1";
                }
            }
        }

        if (scr.equals(numberButton2)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "2";
                } else {
                    tempString1 = tempString1 + "2";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "2";
                } else {
                    tempString2 = tempString2 + "2";
                }
            }
        }
        if (scr.equals(numberButton3)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "3";
                } else {
                    tempString1 = tempString1 + "3";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "3";
                } else {
                    tempString2 = tempString2 + "3";
                }
            }
        }
        if (scr.equals(numberButton4)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "4";
                } else {
                    tempString1 = tempString1 + "4";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "4";
                } else {
                    tempString2 = tempString2 + "4";
                }
            }
        }
        if (scr.equals(numberButton5)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "5";
                } else {
                    tempString1 = tempString1 + "5";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "5";
                } else {
                    tempString2 = tempString2 + "5";
                }
            }
        }
        if (scr.equals(numberButton6)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "6";
                } else {
                    tempString1 = tempString1 + "6";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "6";
                } else {
                    tempString2 = tempString2 + "6";
                }
            }
        }
        if (scr.equals(numberButton7)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "7";
                } else {
                    tempString1 = tempString1 + "7";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "7";
                } else {
                    tempString2 = tempString2 + "7";
                }
            }
        }
        if (scr.equals(numberButton8)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "8";
                } else {
                    tempString1 = tempString1 + "8";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "8";
                } else {
                    tempString2 = tempString2 + "8";
                }
            }
        }
        if (scr.equals(numberButton9)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "9";
                } else {
                    tempString1 = tempString1 + "9";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "9";
                } else {
                    tempString2 = tempString2 + "9";
                }
            }
        }
        if (scr.equals(numberButton)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "0";
                } else {
                    tempString1 = tempString1 + "0";
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "0";
                } else {
                    tempString2 = tempString2 + "0";
                }
            }
        }
        if (scr.equals(decimalButton)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "0.";
                } else if (tempString1 != null) {
                    if (tempString1.contains(".")) {
                        System.out.println("You already have a decimal point!");
                    } else {
                        tempString1 += ".";
                    }
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "0.";
                } else if (tempString2 != null) {
                    if (tempString2.contains(".")) {
                        System.out.println("Again you already have a decimal point!");
                    } else {
                        tempString2 += ".";
                    }
                }
            }
        }

        if (scr.equals(negativeButton)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    tempString1 = "-";
                } else if (tempString1 != null && tempString1.startsWith("-")) {
                    tempString1 = tempString1.substring(1);
                } else {
                    tempString1 = "-" + tempString1;
                }
            } else {
                if (tempString2 == null) {
                    tempString2 = "-";
                } else if (tempString2 != null && tempString2.startsWith("-")) {
                    tempString2 = tempString2.substring(1);
                } else {
                    tempString2 = "-" + tempString2;
                }
            }
        }

        if (scr.equals(backSpaceButton)) {
            if (opChosen == false) {
                if (tempString1 == null) {
                    System.out.println("CAN'T DELETE NOTHING!!!");
                } else {
                    tempString1 = tempString1.substring(0, tempString1.length() - 1);
                }
            } else {
                if (tempString2 == null) {
                    System.out.println("CAN'T DELETE NOTHING!!!");
                } else {
                    tempString2 = tempString2.substring(0, tempString2.length() - 1);
                }
            }
        }

        if (equalsClicked == false) {
            if (opChosen == false) {
                outputTextArea.setText(tempString1);
            } else {
                outputTextArea.setText(tempString2);
            }
        }
    }
}
