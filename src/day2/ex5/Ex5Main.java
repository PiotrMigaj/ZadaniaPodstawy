package day2.ex5;

import day2.ex2.StringHelper;
import day2.test.Helper;

public class Ex5Main {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char letter = 'a';

        int result = numberOfOccuranceOfCharInString(input,letter);
        System.out.println(result);

        System.out.println(numberOfOccuranceOfCharInString(null,letter));
    }

    public static int numberOfOccuranceOfCharInString(String input, char letter){

        int counter = 0;

        if (StringHelper.isValid(input)&&input.contains(String.valueOf(letter))){

            //Nie ma potrzeby
//            char[] array = input.toCharArray();
//            for (int i =0;i< array.length;i++){
//                if (array[i]==letter){
//                    counter++;
//                }
//            }

            for(int i=0;i<input.length();i++){
                if (input.charAt(i)==letter){
                    counter++;
                }
            }

         }

        return counter;
    }

}
