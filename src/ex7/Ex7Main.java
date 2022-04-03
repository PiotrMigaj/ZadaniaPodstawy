package ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        run();

    }

    private static void run() {

        String decision;

        do {

            System.out.print("Enter first digit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            String operator = getAndValidateOperator();

            System.out.print("Enter second digit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);

            if (!(operator.equals("/") && secondDigit == 0)) {
                System.out.println("Result of operation: " + firstDigit + " " + operator + " " + secondDigit + " = " + result);
            }

            System.out.println("New calculation or Stop?");
            decision = scanner.nextLine();

        } while (!"Stop".equals(decision));
    }

    public static String getAndValidateOperator() {

        String operator = null;
        boolean checker = true;

        do {

            System.out.print("Enter operator - choose one of + - * /: ");
            operator = scanner.nextLine();

            switch (operator) {
                case "+":
                    return operator;
                case "-":
                    return operator;
                case "*":
                    return operator;
                case "/":
                    return operator;
                default:
                    System.out.println("Operator not exist. Choose one more time.");
                    break;
            }

        } while (checker);

        return operator;
    }


    private static float calculate(float firstDigit, float secondDigit, String operator) {

        switch (operator) {
            case "+":
                return firstDigit + secondDigit;
            case "-":
                return firstDigit - secondDigit;
            case "*":
                return firstDigit * secondDigit;
            case "/":
                if (secondDigit == 0) {
                    System.out.println("Wrong operation.");
                    break;
                } else {
                    return firstDigit / secondDigit;
                }

            default:
                break;
        }

        return 0;
    }

    public static boolean isValidateOperator(String operator){

        Pattern pattern = Pattern.compile("[\\+\\-\\*\\/]");
        Matcher matcher = pattern.matcher(operator);

        if (matcher.matches()){
            return true;
        }

        return false;
    }

}

