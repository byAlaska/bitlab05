package bitlab.askar.module1.lesson10;

public class Main {
    public static void main(String []args){

        Shape []shapes = new Shape[5];

        shapes[0] = new Circle(0,10);
        shapes[1] = new Circle(0,15);
        shapes[2] = new Square(4,5);
        shapes[3] = new Square(4,15);
        shapes[4] = new Square(4,20);


        for (int i=0;i<5;i++){
            System.out.println(shapes[i].getArea());
            System.out.println(shapes[i].getPerimeter());
        }

    }
}
