package bitlab.askar.module1.lesson9;

public class Animal{
    String name;
    int weight;
    int height;

    public Animal() {
    }

    public Animal(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void run(){
        System.out.println(name + " is running");
    }

}
