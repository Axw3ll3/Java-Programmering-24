package JurassicPark.food;

public abstract class Food {
    private String name;
    private int nutritionalValue;
    private boolean isPoisonous;

    public Food(String name, int nutritionalValue, boolean isPoisonous) {
        this.name = name;
        this.nutritionalValue = nutritionalValue;
        this.isPoisonous = isPoisonous;
    }

    public String getName() {
        return name;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }
}