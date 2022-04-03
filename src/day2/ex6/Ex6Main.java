package day2.ex6;

import day2.ex2.StringHelper;

public class Ex6Main {
    public static void main(String[] args) {

        String input = "Ala ma kota";
        char letter = 'z';

        int result = indexOfFirstChar(input,letter);
        System.out.println(result);

    }

    public static int indexOfFirstChar(String input, char letter){

//        if (StringHelper.isValid(input)){
//
//            return input.indexOf(letter);
//
//        }

        if (StringHelper.isValid(input)&&input.contains(String.valueOf(letter))){
            for(int i=0;i<input.length();i++){
                if(input.indexOf(i)==letter){
                    return i;
                }
            }
        }

//        for(;;){
        //wychodzi z pętli
//            break;
//        }

//        for(;;){
        //przeskakuje iterację
//            continue;
//        }

        return -1;
    }
}
