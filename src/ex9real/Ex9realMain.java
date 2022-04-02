package ex9real;

public class Ex9realMain {
    public static void main(String[] args) {

        int rangeFrom = 1;
        int rangeTo = 20;

        for (int i = rangeFrom;i<=rangeTo;i++){
            System.out.println(fizzBuzz(i));
        }


        run();
    }

    private static String fizzBuzz(int number) {

        if (number%15==0){
            return "FizzBuzz";
        }
        if (number%3==0){
            return "Fizz";
        }
        if (number%5==0){
            return "Buzz";
        }

        return String.valueOf(number);

    }

    public static void run() {
        int x = 15;

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }


}
