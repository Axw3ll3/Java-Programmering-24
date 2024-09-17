public class Challenges_3 {
    
    class House_Class {
        private double area;
        private int floors;
        private int buildYear;
        private String adress;
        
        public House_Class(double area, int floors, int buildYear, String adress) {
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
    
    
        public static void main(String[] args) {
        House_Class House = new House_Class(74,6, 4, 1990, "Berggatan 12");
        House.houseDetails();
    }
}
}
