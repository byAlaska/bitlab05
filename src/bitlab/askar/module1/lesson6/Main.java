package bitlab.askar.module1.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);



        //pract - 5
//        int n = in.nextInt();
//
//        int[][] array = new int[n][n];
//
//        for (int i=0;i<array.length;i++){
//            for (int j=0;j<array[i].length;j++){
//                array[i][j] = in.nextInt();
//            }
//        }
//
//
//        boolean b = false;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if (array[i][j] == array[j][i]){
//                    b = true;
//                }else {
//                    b = false;
//                    break;
//                }
//            }
//            if(!b) break;
//        }
//
//
//        if(b) System.out.println("Yes");
//        else System.out.println("No");




        //lab - 3

//        int n =in.nextInt();
//
//        int[][] nums = new int[n][n];
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                nums[i][j] = in.nextInt();
//            }
//        }
//
//
//        for (int i=0;i<nums.length/2;i++){
//            if (n%2==1){
//                int []bubble = nums[i];
//                nums[i] = nums[n/2+1+i];
//                nums[n/2+1+i] = bubble;
//            }else {
//                int []bubble = nums[i];
//                nums[i] = nums[n/2+i];
//                nums[n/2+i] = bubble;
//            }
//        }
//
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                System.out.print(nums[i][j]);
//            }
//            System.out.println();
//        }




        //lab - 2
//        int n =in.nextInt();
//
//        int[][] nums = new int[n][n];
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                nums[i][j] = in.nextInt();
//            }
//        }
//
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                if (i==j || n-1 == i+j){
//                    System.out.print("X ");
//                }else {
//                    System.out.print(nums[i][j] + " ");
//                }
//            }
//            System.out.println();
//        }





        //lab - 4

//        int n =in.nextInt();
//        int m = in.nextInt();
//
//        int[][] nums = new int[n][m];
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                nums[i][j] = in.nextInt();
//            }
//        }



//        1 2 3 4 5
//        7 6 4 2 3
//        0 7 8 9 4
//        8 9 0 1 5
//        5 2 3 7 6



//        for (int i=0;i<m;i++){
//
//            int max = nums[0][i];
//            int min = nums[0][i];
//            int maxIndex = 0;
//            int minIndex = 0;
//
//            for (int j=0;j<n;j++){
//                if (nums[j][i]>max){
//                    max = nums[j][i];
//                    maxIndex = j;
//                }
//                if (nums[j][i]<min){
//                    min = nums[j][i];
//                    minIndex = j;
//                }
//            }
//            nums[minIndex][i] = max;
//            nums[maxIndex][i] = min;
//        }
//
//
//        for (int i=0;i<nums.length;i++){
//            for (int j=0;j<nums[i].length;j++){
//                System.out.print(nums[i][j]);
//            }
//            System.out.println();
//        }


    }
}
