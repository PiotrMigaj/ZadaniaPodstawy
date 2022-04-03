package day2.ex15SDA;

public class Ex15SDAMain {
    public static void main(String[] args) {
        String[] array1 = {"Ala","ma","kota"};
        String[] array2 = {"Ala","ma","kota"};

        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(areEqual(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(areEqual(firstArray4, secondArray4));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {

        if (firstArray.length == secondArray.length){
            for (int i=0;i< firstArray.length;i++){

                String firstArrElement = firstArray[i];
                String secondArrElement = secondArray[i];

                if (firstArrElement ==null&& secondArrElement ==null){
                    continue;
                }
                if (firstArrElement==null||!firstArrElement.equals(secondArrElement)){
                    return false;
                }
//                if (firstArrElement==null||secondArrElement==null){
//                    return false;
//                }
//                if (!firstArrElement.equals(secondArrElement)){
//                    return false;
//                }

            }
            return true;
        }

        return false;
    }
}
