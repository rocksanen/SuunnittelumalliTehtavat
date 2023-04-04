package adapter;

public class RectangleAdapter implements Shape {

    Rectangle rectangle;

    public RectangleAdapter(Rectangle r) {
        rectangle = r;
    }

    public double getArea() {
        return rectangle.calculateArea();
    }

    public double getPerimeter() {
        return rectangle.calculatePerimeter();
    }
}
