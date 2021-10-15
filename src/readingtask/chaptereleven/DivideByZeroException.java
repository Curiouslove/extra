package readingtask.chaptereleven;

import javax.swing.*;
import java.util.InputMismatchException;

public class DivideByZeroException {

    public static void main(String[] args) {
        boolean loop = true;
        do {
            try {
                int firstNUmber = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number:"));
                int secondNUmber = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number: "));

                int result = divisor(firstNUmber, secondNUmber);

                String displayResult = String.valueOf(result);

                JOptionPane.showMessageDialog(null, "Your answer is: " + displayResult);
                loop = false;
            } catch (NumberFormatException numberFormatException) {
                JOptionPane.showMessageDialog(null, "You must Enter numbers, Please try again.");
            } catch (ArithmeticException arithmeticException){
                JOptionPane.showMessageDialog(null, "Zero is an invalid Divisor, Please try again.");
            }
        }while (loop);
    }

    public static int divisor(int firstNumber, int secondNumber)throws ArithmeticException{
        return firstNumber / secondNumber;
    }

}
