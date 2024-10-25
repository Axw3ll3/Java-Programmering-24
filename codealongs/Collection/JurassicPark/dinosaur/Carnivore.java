package JurassicPark.dinosaur;

import JurassicPark.food.Food;
import JurassicPark.food.MeatFood;

public class Carnivore extends Dinosaur {
    public Carnivore(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Food food) {
        return food instanceof MeatFood;
    }

    @Override
    public void eat(Food food) {
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
        return "Carnivore";
    }
}