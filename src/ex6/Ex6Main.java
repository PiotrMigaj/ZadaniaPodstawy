package ex6;

import java.util.Scanner;

public class Ex6Main {
    public static void main(String[] args) {
        //run();

        printMultiplicationTable(6,2,5);
    }

//    public static void run(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter multiplier: ");
//        int multiplier = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter minMultiplicand: ");
//        int minMultiplicand = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter maxMultiplicand: ");
//        int maxMultiplicand = scanner.nextInt();
//        scanner.nextLine();
//
//        printMultiplicationTable(multiplier,minMultiplicand,maxMultiplicand);
//
//    }
//
//    private static int[] multiplicationArray(int multiplier,int minMultiplicand,int maxMultiplicand){
//
//        int[] resultArr = new int[maxMultiplicand-minMultiplicand+1];
//
//        for (int i=0;i<resultArr.length;i++){
//            resultArr[i]=multiplier*minMultiplicand++;
//        }
//
//        return resultArr;
//
//    }
//
//    private static void printMultiplicationTable(int multiplier,int minMultiplicand,int maxMultiplicand){
//
//        int[] array = multiplicationArray(multiplier,minMultiplicand,maxMultiplicand);
//
//        for (int i=0;i< array.length;i++){
//            System.out.println(multiplier + " x "+minMultiplicand++ + " = "+ array[i]);
//        }
//
//    }

        private static void printMultiplicationTable(int multiplier,int minMultiplicand,int maxMultiplicand){

            while (minMultiplicand<=maxMultiplicand){
                int result = multiplier*minMultiplicand;

                System.out.println(multiplier + " x "+minMultiplicand + " = "+result);

                minMultiplicand++;
            }
        }
}
