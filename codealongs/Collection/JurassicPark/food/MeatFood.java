package JurassicPark.food;

public class MeatFood extends Food {
   private boolean isFresh;

   public MeatFood(String name, int nutritionalValue, boolean isFresh, boolean isPoisonous) {
     super(name, nutritionalValue, isPoisonous);
     this.isFresh = isFresh;
    }

    @Override
    public String getFoodType() {
        return "Meat";
    }

    public boolean isFresh() {
        return isFresh;
    }
}