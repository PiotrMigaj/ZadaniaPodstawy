package ex1;

public class Ex1Main {

    public static void main(String[] args) {

        runInt();

        System.out.println();

        runBinary();

        System.out.println();

        runHex();

        //new Ex1Main().run();

    }

    private static void runInt(){
        int big_S_char = 83;
        int big_D_char = 68;
        int big_A_char = 65;

        System.out.print((char)big_S_char);
        System.out.print((char)big_D_char);
        System.out.print((char)big_A_char);
    }

    private static void runBinary(){
        char big_S_char = 0b01010011;
        char big_D_char = 0b01000100;
        char big_A_char = 0b01000001;

        System.out.print(big_S_char);
        System.out.print(big_D_char);
        System.out.print(big_A_char);
    }

    private static void runHex(){
        char big_S_char = 0x53;
        char big_D_char = 0x44;
        char big_A_char = 0x41;

        System.out.print(big_S_char);
        System.out.print(big_D_char);
        System.out.print(big_A_char);
    }



}
