package bitlab.askar.module1.lesson7;

public class Main {
    public static void main(String args[]){

        System.out.println(getMax(5,4));
        System.out.println(getMax(5,4,3));

        int []array = {12,3,4,5,7,9,0};
        System.out.println(getMax(array));

    }

    public static int getMax(int a, int b){
        if (a>b) return a;
        else return b;
    }

    public static int getMax(int a,int b, int c){
        if (a>b && a>c) return a;
        if (b>a && b>c) return b;
        return c;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]) max = array[i];
        }
        return max;
    }


}
