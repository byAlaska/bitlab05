package bitlab.askar.module2.lesson2;


import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in  = new Scanner(System.in);

        int pinCode;

        try {
            pinCode = in.nextInt();

        }catch (Exception e){
            System.out.println("VVedite normalno");
        }

        System.out.println("Hello");

    }
}