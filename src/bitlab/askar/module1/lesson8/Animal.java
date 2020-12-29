package bitlab.askar.module1.lesson8;

public class Animal {

    private String name;
    private int legs;
    private int weight;
    private int height;

    public Animal() {
    }

    public Animal(String name, int legs, int weight, int height){
        this.name = name;
        this.legs = legs;
        this.weight = weight;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void run(){
        System.out.println(name + ", " + legs + ", " + weight + ", " + height + " is running");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void tell(){
        System.out.println("Hello");
    }
}
