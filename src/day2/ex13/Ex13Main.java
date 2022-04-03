package day2.ex13;

public class Ex13Main {

    public static void main(String[] args) {
        //int[] inputs = new int[]{12,19,7};

        //int[] inputs = {12,19,7};

        int[] inputs = new int[3];
        inputs[0]=12;
        inputs[1]=19;
        inputs[2]=7;

        System.out.println(sum(inputs));
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));

    }

    private static int getMinValue(int[] inputs){

        //int minValue;

        int minValue = inputs[0];
        //int minValue = Integer.MAX_VALUE;

//        for(int i = 1;i<inputs.length;i++){
//            int currentElement = inputs[i];
//            if(currentElement<minValue){
//                minValue=currentElement;
//            }
//        }

        for (int element :inputs) {
            if(element<minValue){
                minValue = element;
            }
        }

        return minValue;
    }

    private static int getMaxValue(int[] inputs){

        int maxValue = inputs[0];

        for (int element :inputs) {
            if(element>maxValue){
                maxValue = element;
            }
        }

        return maxValue;

    }

    private static int sum(int[] inputs){

        int sum = 0;
        for (int element:inputs) {

            sum+=element;
        }

        return sum;
    }

}
