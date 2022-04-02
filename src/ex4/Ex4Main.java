package ex4;

import java.util.Scanner;

public class Ex4Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float weight;
        int height;

        System.out.println("Enter the weight [kg]: ");
        weight = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter the height [cm]: ");
        height = scanner.nextInt();
        scanner.nextLine();

        float bmiIndex = weight/(float) Math.pow(height/100.0,2);

        System.out.println(bmiIndex);

    }
}
