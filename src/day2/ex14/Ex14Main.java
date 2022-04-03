package day2.ex14;

import java.util.Arrays;

public class Ex14Main {
    public static void main(String[] args) {
        int[] arrayOfInts = {12,-7,19,-5};
        int lengthOfNewArray = countNegativeNumbers(arrayOfInts);

        if(lengthOfNewArray>0){

        }

        System.out.println(countNegativeNumbers(arrayOfInts));
        System.out.println(Arrays.toString(arrayOfNegativeIntegers(arrayOfInts,countNegativeNumbers(arrayOfInts))));

        int[] secondArrayOfInt = {12,6};
        System.out.println(countNegativeNumbers(secondArrayOfInt));
        System.out.println(Arrays.toString(arrayOfNegativeIntegers(secondArrayOfInt,countNegativeNumbers(secondArrayOfInt))));
    }

    private static int countNegativeNumbers(int[] array){

        int counter = 0;
//        for (int i=0;i<array.length;i++){
//
//        }

        for (int element :array) {
            if (element<0){
                counter++;
            }
        }
        return counter;
    }

    private static int[] arrayOfNegativeIntegers(int[] array, int numberOfNegativeIntegers){

        if (numberOfNegativeIntegers==0){
            return null;
        }else {

            //int tmp=0;
            int[] arrayOfNegatives = new int[numberOfNegativeIntegers];

            for (int i=0 , j=0;i<array.length;i++){
                if (array[i]<0){
                    arrayOfNegatives[j]=array[i];
                    j++;
                }
            }

            return arrayOfNegatives;

        }


        //return null;
    }


}
