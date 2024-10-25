package JurassicPark.dinosaur.behavior;

import JurassicPark.food.Food;

public interface Eats {
    boolean canEat(Food food); 
    void eat (Food food);
}