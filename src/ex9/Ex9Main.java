package ex9;

import java.util.Scanner;

public class Ex9Main {
    public static void main(String[] args) {

        int rangeFrom = 0;
        int rangeTo = 10;

        for (int i=rangeFrom; i<=rangeTo;i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
            }

            //boolean result = isPrimeNumber(i);
        }

        //System.out.println(isPrime(4));



    }

    private static boolean isPrimeNumber(int number) {

        if(number<2){
            return false;
        }
        for(int i=2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }

        return true;
    }

//    private static void run(){
//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//
//
//    }

    private static boolean isPrime(int number){

        boolean checker = true;

        //int squareNumber = (int)Math.sqrt(number);

        for (int i=2;i<=number;i++){
            if (number%i==0&&i!=number){
                checker=false;
            }
        }

        return checker;
    }




}
