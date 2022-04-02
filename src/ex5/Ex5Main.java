package ex5;

import java.util.Scanner;

public class Ex5Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit:");
        int firstDigit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter second digit:");
        int secondDigit = scanner.nextInt();
        scanner.nextLine();

        int sum = sumOfTheSequence(firstDigit,secondDigit);
        System.out.println("Sum: "+sum);


    }

    private static int sumOfTheSequence(int firstDigit, int secondDigit) {

        //Walidacja bardzo ważne + pytanie na rozmowie rekrutacyjnej
        if (firstDigit>secondDigit){
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }

        int sum=0;
        for (int i=firstDigit;i<=secondDigit;i++){
            sum+=i;
        }

        //Tak też można
//        for (;firstDigit<=secondDigit;firstDigit++){
//            sum+=firstDigit;
//        }

//        while (firstDigit<=secondDigit){
//            sum+=firstDigit;
//            firstDigit++;
//        }

//        do{
//            sum+=firstDigit;
//            firstDigit++;
//        }while (firstDigit<=secondDigit);

        return sum;




    }


}
