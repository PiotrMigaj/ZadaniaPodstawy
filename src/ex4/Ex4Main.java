package ex4;

import java.util.Scanner;

public class Ex4Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final float BMI_MIN_RANGE = 18.5f;
    private static final float BMI_MAX_RANGE = 24.9f;

    public static void main(String[] args) {
        run();
    }

//    public static void run(){
//        Scanner scanner = new Scanner(System.in);
//
//        float weight;
//        int height;
//
//        System.out.println("Enter the weight [kg]: ");
//        weight = scanner.nextFloat();
//        scanner.nextLine();
//
//        System.out.println("Enter the height [cm]: ");
//        height = scanner.nextInt();
//        scanner.nextLine();
//
//        float bmiIndex = weight/(float) Math.pow(height/100.0,2);
//
//        System.out.println(bmiIndex);
//    }

    public static void run(){

        float heightFromUser = getHeightFromUser(scanner);
        float weightFromUser = getWeightFromUser(scanner);
        float bmi = calculateBMI(weightFromUser, heightFromUser);
        displayBMIResult(bmi);

    }

    private static float getWeightFromUser(Scanner scanner){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight [kg]: ");
        return scanner.nextFloat();
    }

    private static float getHeightFromUser(Scanner scanner){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height [cm]: ");
        return scanner.nextInt();
    }

    //Bardzo często daję się tak, ponieważ w ciele metody nie można zmodyfikować argumentów

//    private static float calculateBMI(final float weight, final float height){
//
//        return 0;
//    }

    private static float calculateBMI(float weight, float height){

        //weight / height[m]^2

        float heightInMeter = height/100.0f;

        return weight/(float) Math.pow(heightInMeter,2);

    }

    private static void displayBMIResult(float bmi){
        if (bmi< BMI_MIN_RANGE || bmi> BMI_MAX_RANGE){
            System.out.println("BMI is not correct: "+bmi);
        }else{
            System.out.println("BMI is correct: "+bmi);
        }
    }
}
