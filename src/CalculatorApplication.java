import javax.swing.*;

public class CalculatorApplication {
    public static void main(String[] args) {
        int operandOne = Integer.parseInt(JOptionPane.showInputDialog("Enter your first value: "));
        String operator = JOptionPane.showInputDialog("Enter the operation sign (+, _,  *, /):");
        int operandTwo = Integer.parseInt(JOptionPane.showInputDialog("Enetr your second value: "));

    }
}
