package day2.ex2;

import java.util.function.Predicate;

public class Ex2Main {


    public static void main(String[] args) {
        System.out.println(isTextStartsWithPrefix("programowanie","pro"));
        //System.out.println(isTextEndsWithSuffix("programowanie","nie"));


    }


    private static boolean isTextStartsWithPrefix(String text, String prefix){

//        if (text.startsWith(prefix)){
//            return true;
//        }

        if(StringHelper.isValid(text) && StringHelper.isValid(prefix)){
            return text.startsWith(prefix);
        }

        return false;
    }

//    private static boolean isTextEndsWithSuffix(String text, String suffix){
//
//        if (text.endsWith(suffix)){
//            return true;
//        }
//
//        return text.endsWith(suffix);
//    }


}
