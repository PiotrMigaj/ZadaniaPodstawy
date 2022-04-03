package day2.ex15;

public class Ex15Main {

    public static void main(String[] args) {
        String[] array1 = {"Ala","ma","kota"};
        String[] array2 = {"Ala","ma","kota"};

        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(isStringArrayEqualsAnotherStringArray(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(isStringArrayEqualsAnotherStringArray(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(isStringArrayEqualsAnotherStringArray(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(isStringArrayEqualsAnotherStringArray(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(isStringArrayEqualsAnotherStringArray(firstArray4, secondArray4));

        //System.out.println(isStringArrayEqualsAnotherStringArray(array1,array2));

    }

    private static boolean isLenghtOfArraysTheSame(String[] firstArray, String[] secondArray){

        return firstArray.length==secondArray.length;

    }

    private static boolean isStringEqualsAnotherString(String firstString, String secondString){

        if (firstString==null&&secondString==null){
            return true;
        }
        if (firstString==null||secondString==null){
            return false;
        }
        if (firstString.equals(secondString)){
            return true;
        }
        return false;
    }

    private static boolean isStringArrayEqualsAnotherStringArray(String[] firstArray, String[] secondArray){

        //boolean checker = false;

        for (int i =0;i<firstArray.length;i++){
            if (!isStringEqualsAnotherString(firstArray[i],secondArray[i])){
                return false;
            }
        }

        return true;
    }



}
