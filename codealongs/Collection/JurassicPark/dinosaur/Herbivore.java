package JurassicPark.dinosaur;

import JurassicPark.food.Food;
import JurassicPark.food.PlantFood;

public class Herbivore extends Dinosaur {
    public Herbivore(String name) {
        super(name);
    }   

    @Override
    public boolean canEat(Food food) {
        return food instanceof PlantFood;
    }

    @Override
    public void eat (Food food) {
        System.out.println("Offering " + food.getName() + " to " + getName() + " (" + getDinoType() + ")...");
       
        if (canEat(food)) {
            if (food.isPoisonous()) {
                makesSick();
            } else {
                addEnergy(food.getNutritionalValue());
                System.out.println(getName() + " ate " + food.getName() + " and gained "
                    + food.getNutritionalValue() + " energy!");
            }
        } else {
            System.out.println(getName() + " can't eat " + food.getName() + "!");
        } 
    }

    @Override
    public String getDinoType() {
        return "Herbivore";
    }
}