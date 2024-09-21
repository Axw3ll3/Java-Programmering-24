package Challenge_3_and_classes;
  
public class Main {
        public static void main(String[] args) {
        House House1 = new House(74.6, 4, 1990, "Berggatan 12");
        House House2 = new House (56.2, 2, 2010, "Bullerbyvägen 56");
        House House3 = new House (100.5, 6, 2015, "Klubbhusgatan 27");
        
        /*
        House1.houseDetails();
        System.out.println("");
        House2.houseDetails();
        System.out.println("");
        House3.houseDetails();
        System.out.println("");
        */
        
        Human Human1 = new Human("Axel", "Construction worker", 21, "Man", 170, House1);
        Human1.printHumanDetails();
        House1.showAdress();
        System.out.println("");

        Human Human2 = new Human("Karl", "Programmer", 32, "Man", 186, House2);
        Human2.printHumanDetails();
        House2.showAdress();
        System.out.println("");

        Human Human3 = new Human("Tilda", "Editor", 27, "Woman", 167, House3);
        Human3.printHumanDetails();
        House3.showAdress();
        System.out.println("");
    }
}