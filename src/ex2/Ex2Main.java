package ex2;

import java.util.Scanner;

public class Ex2Main {

    public static void main(String[] args) {

        run();

    }

    private static void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diameter of the circle: ");

        float diameter = scanner.nextFloat();
        scanner.nextLine();

        //Value of PI = 3.14
        float circumferenceOfTheCircle = 3.14f*diameter*diameter/4;
        float areaOfTheCircle = 3.14f*diameter;

        System.out.println("Results with PI = 3.14");
        System.out.println("Circumference Of A Circle: "+ circumferenceOfTheCircle);
        System.out.println("Area Of A Circle: "+ areaOfTheCircle);

        System.out.println();

        //Value of PI from Math.PI
        circumferenceOfTheCircle = (float) Math.PI*diameter*diameter/4;
        areaOfTheCircle = (float)Math.PI*diameter;

        System.out.println("Results with PI from Math.PI");
        System.out.println("Circumference Of A Circle: "+ circumferenceOfTheCircle);
        System.out.println("Area Of A Circle: "+ areaOfTheCircle);
    }

}
