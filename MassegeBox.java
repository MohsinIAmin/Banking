package test;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MassegeBox {

    private static String input;

    private static boolean cheacker() {
        int check = input.length() - 1;
        int checkIndex = 0;
        if ('-' == input.charAt(checkIndex)) {
            checkIndex++;
        }
        for (; checkIndex <= check; checkIndex++) {
            if (!Character.isDigit(input.charAt(checkIndex))) {
                return false;
            }
        }
        return true;
    }

    private static boolean cheackerDouble() {
        int check = input.length() - 1;
        int checkIndex = 0;
        boolean dotCheck = true;
        if ('-' == input.charAt(checkIndex)) {
            checkIndex++;
        }
        for (; checkIndex <= check; checkIndex++) {
            if ('.' == input.charAt(checkIndex) && dotCheck) {
                dotCheck = false;
            } else if (!Character.isDigit(input.charAt(checkIndex))) {
                return false;
            }
        }
        return true;
    }

    public static double inputBoxDouble(String showMassege) {
        input = JOptionPane.showInputDialog(showMassege);
        if (!cheackerDouble()) {
            return -1;
        }
        double number = Double.parseDouble(input);
        return number;
    }

    public static int inputBoxInt(String showMassege) {
        input = JOptionPane.showInputDialog(showMassege);
        if (!cheacker()) {
            return -1;
        }
        int number = Integer.parseInt(input);
        return number;
    }

    public static int inputBoxInt(String massage, String top, String[] str) {
        return JOptionPane.showInternalOptionDialog(null, top, massage,
                0, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);
    }

    public static int inputBoxInt(String top, String massege) {
        return 1 + JOptionPane.showConfirmDialog(null, massege, top, JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
    }

    public static String inputBoxString(String showMassege) {
        input = JOptionPane.showInputDialog(showMassege);
        return input;
    }

    public static void outputBox(String showMassege) {
        JOptionPane.showMessageDialog(null, showMassege);
    }

    public static void outputBox(String worning, String showMassege) {
        JOptionPane.showMessageDialog(null, showMassege, worning, JOptionPane.ERROR_MESSAGE);
    }

}
