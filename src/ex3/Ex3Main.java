package ex3;

import java.util.Scanner;

public class Ex3Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert first digit: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please insert second digit: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        //If firstNumber is greater than secondNumber

        if (firstNumber>secondNumber){
            System.out.println("firstNumber is greater than secondNumber: " + (firstNumber>secondNumber));
        }else {
            System.out.println("firstNumber is greater than secondNumber: " + (firstNumber>secondNumber));
        }

        //If firstNumber * 3 is greater than secondNumber

        if (firstNumber*3>secondNumber){
            System.out.println("firstNumber * 3 is greater than secondNumber: " + (firstNumber*3>secondNumber));
        }else {
            System.out.println("firstNumber * 3 is greater than secondNumber: " + (firstNumber*3>secondNumber));
        }

        //If firstNumber++ is smaller than ++x and --x is smaller than y++

        if (secondNumber++ < ++firstNumber && --firstNumber < secondNumber ++){
            System.out.println("firstNumber++ is smaller than ++x and --x is smaller than y++: " + (secondNumber++ < ++firstNumber && --firstNumber < secondNumber ++));
        }else {
            System.out.println("firstNumber++ is smaller than ++x and --x is smaller than y++: " + (secondNumber++ < ++firstNumber && --firstNumber < secondNumber ++));
        }

        //If firstNumber*secondNumber is even: true

        if (firstNumber*secondNumber%2==0){
            System.out.println("firstNumber*secondNumber is even: "+(firstNumber*secondNumber%2==0));
        }else{
            System.out.println("firstNumber*secondNumber is even: "+(firstNumber*secondNumber%2==0));
        }

    }

}
