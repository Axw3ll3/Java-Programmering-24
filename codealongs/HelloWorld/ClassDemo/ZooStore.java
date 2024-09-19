package ClassDemo;

public class ZooStore {

    public static void main(String[] args){
        Cat storeCat = new Cat("Kosmos", "Bondkatt", 6);
        System.out.println(storeCat.name); // Public
        System.out.println(storeCat.breed); // Protected
        //System.out.println(storeCat.age); // Private

    }
    
}
