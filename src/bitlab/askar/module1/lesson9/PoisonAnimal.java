package bitlab.askar.module1.lesson9;

public class PoisonAnimal extends Animal{
    int poison;

    public PoisonAnimal(String name, int weight, int height, int poison) {
        super(name, weight, height);
        this.poison = poison;
    }
}
