package day2.ex1;

import day2.ex2.StringHelper;

public class Ex1Main {
    private static final char STRING = '\u0000';

    public static void main(String[] args) {

        run();
    }

    public static void run(){
        System.out.println(lastCharOfString(null));
        System.out.println(lastCharOfString(""));
    }

    public static char lastCharOfString(String text){

        if (StringHelper.isValid(text)){
            return text.charAt(text.length()-1);
        }

        //dać defaultowego chara najlepiej do stałej
        return STRING;
    }
}
