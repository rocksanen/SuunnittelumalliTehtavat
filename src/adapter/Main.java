package adapter;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 7);
        Shape shape = new RectangleAdapter(rectangle);

        System.out.println("Rectangle area: " + shape.getArea());
        System.out.println("Rectangle perimeter: " + shape.getPerimeter());
    }
}
