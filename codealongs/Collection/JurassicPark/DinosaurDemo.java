package JurassicPark;
import JurassicPark.food.*;
import JurassicPark.dinosaur.*;

public class DinosaurDemo {
    public static void main(String[] args) {

        // Create different food types
        Food grass = new PlantFood("Grass", 10, false, false);
        Food berries = new PlantFood("Berries", 15, true, false);
        Food poisonousBerries = new PlantFood("Nightshade Berries", 5, true, true);
        Food meat = new MeatFood("Fresh Meat", 25, true, false);
        Food rottenMeat = new MeatFood("Rotten Meat", 5, false, true);

        // Create Dinosaurs
        Dinosaur trex = new Carnivore("T-Rex");
        Dinosaur brachiosaurus = new Herbivore("Brachiosaurus");


        System.out.println("=== Feeding Demonstration ===\n");
        
        // Feed herbivore
        brachiosaurus.eat(grass);           
        System.out.println("-------------------------");
        brachiosaurus.eat(meat);            
        System.out.println("-------------------------");
        brachiosaurus.eat(poisonousBerries);
        System.out.println("-------------------------");
        
        // Feed carnivore
        trex.eat(meat);                     
        System.out.println("-------------------------");
        trex.eat(grass);                    
        System.out.println("-------------------------");
        trex.eat(rottenMeat);              
        System.out.println("-------------------------");
        
        // Show Dinosaurs status
        System.out.println("\n=== Dinosaur Status ===");
        System.out.println(brachiosaurus.getName() + " (" + brachiosaurus.getDinoType() + "):");
        System.out.println("Energy: " + brachiosaurus.getEnergy());
        System.out.println("Sick: " + brachiosaurus.isSick());
        
        System.out.println("\n" + trex.getName() + " (" + trex.getDinoType() + "):");
        System.out.println("Energy: " + trex.getEnergy());
        System.out.println("Sick: " + trex.isSick());
    }
}