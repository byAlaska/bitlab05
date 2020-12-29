package bitlab.askar.module1.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

//        String s = in.next();
//        String s2 = in.next();
//
//        boolean b = false;
//        int j = 0;
//        for (int i=0;i<s.length();i++){
//            if (s2.charAt(j)==s.charAt(i)){
//                j++;
//                if(j==s2.length()){
//                    b=true;
//                    break;
//                }
//            }else {
//                j=0;
//            }
//        }
//
//
//        if (b){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }



        //Bitlab

//        String s = in.next();
//
//        String lowers = s.toLowerCase();
//        String uppers = s.toUpperCase();
//
//        for (int i=0;i<s.length();i++){
//            if (s.charAt(i) == lowers.charAt(i)){
//                System.out.println(uppers.charAt(i));
//            }else {
//                System.out.println(lowers.charAt(i));
//            }
//
//        }


        String s = in.next();

        String s2 = "";
        for (int i=0;i<s.length();i++){
            s2 +=s.charAt(i);
            s2 +=s.charAt(i);
        }

        System.out.println(s2);


    }
}
