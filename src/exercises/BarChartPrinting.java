package exercises;

import javax.swing.*;

public class BarChartPrinting {
    public static void main(String[] args) {
        String numbers = JOptionPane.showInputDialog("Enter five numbers:");
        char firstNumber = numbers.charAt(0);

        System.out.print(firstNumber);
    }
}
