package bitlab.askar.module1.lesson9;

public class Main {
    public static void main(String []args){

        Animal animal = new Animal();
        Cat cat = new Cat("Kitty",20,100,6);

        Dog dog = new Dog("Rex",50,150,false);
        Dog dog2 = new Dog("asdg",100,100,true);

        Frog frog = new Frog("Bobba",5,10,90);
        Frog frog2 = new Frog("Hobba",5,10,90);

        Snake snake = new Snake("Snaky",10,20,95);

        Animal []animals = {animal,cat,dog,dog2,frog,frog2,snake};


        for (int i=0;i<animals.length;i++){
            animals[i].run();

        }


        soSmth(snake);

    }

    public static void soSmth(Animal animal){

    }
}
