package bitlab.askar.module1.lesson9;

public class Cat extends Animal {
    int moushtash;

    public Cat(String name, int weight, int height, int moushtash) {
        super(name, weight, height);
        this.moushtash = moushtash;
    }

    @Override
    public void run() {
        System.out.println(name + " with moushtash:" + moushtash + " is running ");
    }
}
