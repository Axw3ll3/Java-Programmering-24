package JurassicPark.dinosaur;
import JurassicPark.dinosaur.behavior.Eats;

public abstract class Dinosaur implements Eats {
    private String name;
    private int energy;
    private boolean isSick;

    public Dinosaur(String name) {
        this.name = name;
        this.energy = 100;
        this.isSick = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;    
    }

    public int getEnergy () {
        return energy;
    }

    protected void addEnergy (int energy) {
        this.energy += energy;

    }
    
    public boolean isSick() {
        return isSick;
    }

    public void setSick (boolean isSick) {
        this.isSick = isSick;
    }

    protected void makesSick() {
        this.isSick = true;
        this.energy -= 30;
        System.out.println(getName() + " got sick and lost 30 energy!");
    }

    public abstract String getDinoType();
        
}

