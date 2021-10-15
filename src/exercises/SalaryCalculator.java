package exercises;

import javax.swing.*;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter the hours worked: "));
        double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the hourly rate: "));

        double grossPay = calculateGrossPay(hoursWorked, hourlyRate);

        String result = String.valueOf(grossPay);

        JOptionPane.showMessageDialog(null, "your gross pay is = " + result);

    }

    public static double calculateGrossPay(int hoursWorked, double hourlyRate){
        double grossPay;
        double totalGrossPay;
        if (hoursWorked > 40){
            double firstGross = 40 * hourlyRate;
            int extraTime = hoursWorked - 40;
            double secondGross = (extraTime * hourlyRate) / 2;
            totalGrossPay = firstGross + secondGross;
            return totalGrossPay;
        }else {
            grossPay = hoursWorked * hourlyRate;
            return grossPay;
        }
    }
}
