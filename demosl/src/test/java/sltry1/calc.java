package sltry1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                return;
        }
        
        // Unused variable
        int unusedVariable = 0;

        // Hard-coded password
        String password = "12345";

        // Catching generic exception
        try {
            int riskyOperation = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("The result is: " + result);
    }

    // Method that is never used
    private void unusedMethod() {
        System.out.println("This method is never used.");
    }
}
