package ex11;

public class Ex11Main {

    public static void main(String[] args) {

        int divident=20;
        int divider =3;
        int restOfDivision = 0;

        int tmp = divident/divider;

        if(!(tmp*divider==divident)){
            restOfDivision=divident-tmp*divider;
        }

        System.out.println(restOfDivision);
        System.out.println(20%3);

    }

}
