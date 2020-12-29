package bitlab.askar.module2.lesson6;

public class NewThread implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                synchronized (this){
                    System.out.println("Hello ");
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
