package E4_and_classes;

public class Rectangle {
    private int base;
    private int height;
    
    public Rectangle(int base, int height) {
        this.base=base;
        this.height=height;
    }

    public void calcArea() {
        int area = base*height;
        System.out.println("The area of the rectangle is: " +area+ " cm^2");
    }

    public void calcPerimeter() {
        int perimeter = base+base+height+height;
        System.out.println("The perimeter of the rectangle is: " +perimeter+ " cm");
    }
}
