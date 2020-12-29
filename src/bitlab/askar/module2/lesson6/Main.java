package bitlab.askar.module2.lesson6;

import bitlab.askar.module1.lesson10.lab.User;

public class Main {
    public static void main(String []args){

        ThreadGroup group = new ThreadGroup("group first");

        MuThread thread = new MuThread(group,"Thread 1");
        MuThread thread2 = new MuThread(group,"THread 2");
        MuThread thread3 = new MuThread(group,"Thread 3");

        thread.start();
        thread2.start();
        thread3.start();

        //    //    //
          //    //    //
            //    //    //


        ///////
        ///////
        ///////


        while (group.activeCount()>0){

        }

        System.out.println("Finished");






    }
}
