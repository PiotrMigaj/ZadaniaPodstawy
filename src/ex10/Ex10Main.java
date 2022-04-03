package ex10;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex10Main {
    public static void main(String[] args) {

        run();

    }

    public static void run(){
        int number =102560;
        int[] array = arrayOfIntAscending(number);

        int sum = sumElementsOfArray(array);

        System.out.println(sum);

    }

    private static int[] arrayOfIntAscending(int number){

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (number>0){
            arrayList.add(number%10);
            number/=10;
        }

        arrayList.sort((a, b)->a-b);

        int[] array = new int[arrayList.size()];

        for (int i=0;i<array.length;i++){
            array[i]=arrayList.get(i);
        }

        return array;

    }

    private static int sumElementsOfArray(int[] intArray){

        int sum = 0;

        for (int i=0;i< intArray.length;i++){
            sum+=intArray[i];
        }

        return sum;
    }
}
