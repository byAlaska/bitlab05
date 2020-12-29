package bitlab.askar.module1.lesson9;

public class Dog extends Animal{
    boolean hasATail;

    public Dog(String name, int weight, int height, boolean hasATail) {
        super(name, weight, height);
        this.hasATail = hasATail;
    }


    @Override
    public void run() {
        super.run();
    }

    @Override
    public String toString() {
        return "{" + hasATail + name + '\'' + weight + height + '}';
    }
}
