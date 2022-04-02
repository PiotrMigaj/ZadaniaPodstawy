package ex2;

import java.util.Scanner;

public class Ex2Main {

    private static final float PI = 3.14F;

    public static void main(String[] args) {

        run();

    }

//    private static void run(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Diameter of the circle: ");
//
//        float diameter = scanner.nextFloat();
//        scanner.nextLine();
//
//        //Value of PI = 3.14
//        float circumferenceOfTheCircle = 3.14f*diameter*diameter/4;
//        float areaOfTheCircle = 3.14f*diameter;
//
//        System.out.println("Results with PI = 3.14");
//        System.out.println("Circumference Of A Circle: "+ circumferenceOfTheCircle);
//        System.out.println("Area Of A Circle: "+ areaOfTheCircle);
//
//        System.out.println();
//
//        //Value of PI from Math.PI
//        circumferenceOfTheCircle = (float) Math.PI*diameter*diameter/4;
//        areaOfTheCircle = (float)Math.PI*diameter;
//
//        System.out.println("Results with PI from Math.PI");
//        System.out.println("Circumference Of A Circle: "+ circumferenceOfTheCircle);
//        System.out.println("Area Of A Circle: "+ areaOfTheCircle);
//    }

    private static void run(){

//        float diameterFromUser = getDiameterFromUser();
//        float circumference = claculateCircumferenceOfACircle(diameterFromUser);
//        float area = claculateAreaOfACircle(diameterFromUser);
//
//
//        System.out.println("Circumference Of a circle: " + circumference);
//        System.out.println("Area of a circle: " + area);

        System.out.println(claculateAreaOfACircleGenerics(2));
        System.out.println(claculateAreaOfACircleGenerics(2.0f));
        System.out.println(claculateAreaOfACircleGenerics(2.0));

    }

    private static float getDiameterFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        //scanner.nextLine();
        return scanner.nextFloat();
    }

    private static float claculateCircumferenceOfACircle(float diameter){
        return (float) Math.PI *diameter;
        //return PI*diameter;
    }

    private static float claculateAreaOfACircle(float diameter){
        return (float) (Math.PI* Math.pow(diameter,2)/4);
    }

    //metoda generczyna

    private static <T extends Number> float claculateAreaOfACircleGenerics(T diameter){
        return (float) (Math.PI* Math.pow(diameter.doubleValue(),2)/4);
    }

//    public <T extends Number> double add (T one, T two)
//    {
//        return one.doubleValue() + two.doubleValue();
//    }

}
