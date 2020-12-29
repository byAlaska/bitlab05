package bitlab.askar.module1.lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        boolean metZero = false;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0 && !metZero){
                metZero = true;
            }else if (arr[i] == 0 && metZero) {
                break;
            }else if (metZero && arr[i] != 0){
                sum += arr[i];
            }

        }
        System.out.println(sum);
    }
}
