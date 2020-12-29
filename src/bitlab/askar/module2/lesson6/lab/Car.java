package bitlab.askar.module2.lesson6.lab;

public class Car extends Thread {

    int speed; // m/s = 100
    double distance; // m = 1000


    public Car(String name, int speed, double distance) {
        super(name);
        this.speed = speed;
        this.distance = distance;
    }

    public Car(ThreadGroup group, String name, int speed, double distance) {
        super(group, name);
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run() {

        try {

            double currentDistance = 0;
            for (int i=0;i<distance/speed;i++){
                currentDistance += speed;
                System.out.println(getName() + " is on: " +currentDistance);
                sleep(1000);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
