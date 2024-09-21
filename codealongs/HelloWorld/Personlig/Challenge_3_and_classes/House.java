package Challenge_3_and_classes;

public class House {
    private double area;
    private int floors;
    private int buildYear;
    private String adress;
    
    public House(double area, int floors, int buildYear, String adress) {
        this.area=area;
        this.floors=floors;
        this.buildYear=buildYear;
        this.adress=adress;
    }
    
    public void houseDetails() {
        System.out.println("House area: " +area+ " cm^2");
        System.out.println("Amount of floors: " +floors);
        System.out.println("Year the house was built: "+buildYear);
        System.out.println("House adress: " +adress);
    }

    public void showAdress() {
        System.out.println("Adress:" +adress);
    }

}