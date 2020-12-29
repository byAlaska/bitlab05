package bitlab.askar.module1.lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        int x = 10;

        while (x<10){
            System.out.println(x);
            x++;
        }


        do {
            System.out.println(x);
            x++;
        }while (x<10);

    }
}
