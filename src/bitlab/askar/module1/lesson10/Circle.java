package bitlab.askar.module1.lesson10;

public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(int angle, int radius) {
        super(angle);
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 3.14*2*radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

}
