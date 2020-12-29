package bitlab.askar.module2.lesson4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        ArrayList<String> products = read();

        while (true){
            System.out.println("[1] to add product");
            System.out.println("[2] to list product");
            System.out.println("[0] exit");

            int choice = in.nextInt();
            if (choice==1){
                String product = in.next();
                products.add(product);
                write(products);
            }else if (choice==2){
                for (String s:products){
                    System.out.println(s);
                }
            }else {
                break;
            }


        }

    }


    public static ArrayList<String> read(){
        ArrayList<String> strings = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            String s = "";
            while ((s =reader.readLine())!=null){
                strings.add(s);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return strings;
    }


    public static void write(ArrayList<String> products){
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"));
            for (String s:products){
                writer.write(s + "\n");
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
