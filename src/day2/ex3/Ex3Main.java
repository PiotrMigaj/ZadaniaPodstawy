package day2.ex3;

import day2.ex2.StringHelper;

public class Ex3Main {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println(getIndex(input,word));
        System.out.println(getIndex(input,""));
        System.out.println(getIndex(input,"psa"));
    }

    private static int getIndex(String input, String word){

        if (StringHelper.isValid(input)&&StringHelper.isValid(word)){
//            boolean result = input.contains(word);
//            if (result){
//                return input.indexOf(word);
//            }
            return input.indexOf(word);
        }

        return -1;
    }

}
