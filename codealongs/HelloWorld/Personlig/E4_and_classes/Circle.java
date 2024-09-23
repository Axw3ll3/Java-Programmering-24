package E4_and_classes;

public class Circle {
    private double radius;
    private double diameter;
    
    public void calcArea() {
        double area = (Math.PI*(radius*radius));
        System.out.println("The area of the cirle is: " +area+ " cm^2");
    }

    public void calcCircumference() {
        double circumfence = ((diameter*diameter)/Math.PI/4);
        System.out.println("The circumfence is: " + circumfence+ " cm");
    }
}
