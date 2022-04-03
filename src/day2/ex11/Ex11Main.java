package day2.ex11;

public class Ex11Main {

    public static void main(String[] args) {

    }

    private static boolean isPalindrome(String input){
//        String inputAfterReverse = new StringBuilder(input).reverse().toString();
//
//        return input.equals(inputAfterReverse);

        return new StringBuilder(input)
                .reverse()
                .toString()
                .equals(input);
    }
}
