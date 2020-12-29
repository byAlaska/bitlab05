package bitlab.askar.module1.lesson10;

public class Square extends Shape {

    int width;

    public Square() {
    }

    public Square(int angle, int width) {
        super(angle);
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4*width;
    }

    @Override
    public double getArea() {
        return width*width;
    }
}
