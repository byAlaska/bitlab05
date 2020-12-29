package bitlab.askar.module1.lesson10;

public abstract class Shape {

    public int angle;

    public Shape() {
    }

    public Shape(int angle) {
        this.angle = angle;
    }

    public abstract double getPerimeter();
    public abstract double getArea();


}
