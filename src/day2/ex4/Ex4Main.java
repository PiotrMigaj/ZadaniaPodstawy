package day2.ex4;

import day2.ex2.StringHelper;

public class Ex4Main {

    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        System.out.println(replaceString(" Ala ma, kota. a kot, ma Ale"));
    }

    public static String replaceString(String input){
        //String regEx = "[,.]";

//        if(StringHelper.isValid(input)){
//            return input
//                    .replace(".","-STOP-")
//                    .replace(",","-STOP-");
//        }

        if(StringHelper.isValid(input)){
            return input.replaceAll("[.,]", REPLACEMENT);
        }

        return input;
    }
}


