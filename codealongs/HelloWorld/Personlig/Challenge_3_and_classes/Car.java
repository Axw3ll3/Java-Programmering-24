package Challenge_3_and_classes;

public class Car {
    private String model;
    private int worth;
    private double kmCounter;
    private Car car;
    
    public Car(String model, int worth, double kmCounter) {
        this.model=model;
        this.worth=worth;
        this.kmCounter=kmCounter;
    }
    public void printCarDetails() {
        System.out.println("Model: "+model);
        System.out.println("Worth: " +worth+ " kr");
        System.out.println("KM driven: " +kmCounter);
    }

    public void printCar() {
        System.out.println("Car: " +car);
    }
}

