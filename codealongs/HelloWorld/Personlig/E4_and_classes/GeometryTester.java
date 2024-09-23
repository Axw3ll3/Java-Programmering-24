package E4_and_classes;

public class GeometryTester {
    public static void main(String[] args) {
        Circle circle = new Circle (2.5, 5.0);
        Rectangle rectangle = new Rectangle(10, 6);

        circle.calcArea();
        circle.calcCircumference();
        rectangle.calcArea();
        rectangle.calcPerimeter();
    }
    
}
