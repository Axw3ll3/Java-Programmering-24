package JurassicPark.food;

public class PlantFood extends Food {
    private boolean isFruit;
    
    public PlantFood(String name, int nutritionalValue, boolean isFruit, boolean isPoisonous) {
        super(name, nutritionalValue, isPoisonous);
        this.isFruit=isFruit;
    }

    @Override
    public String getFoodType(){
        return "Plant";
    }

    public boolean isFruit() {
        return isFruit;
    }

    
}