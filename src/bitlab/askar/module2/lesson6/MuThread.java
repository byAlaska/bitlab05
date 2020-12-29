package bitlab.askar.module2.lesson6;

public class MuThread extends Thread {



    public MuThread(String name) {
        super(name);
    }

    public MuThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                System.out.println("Hello -> " + getName());
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
