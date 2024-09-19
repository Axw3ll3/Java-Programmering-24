import ClassDemo.Cat;

public class EvilCatStore {

    public static void main(String[] args){
        Cat kitty = new Cat("Kosmos", "Bondkatt", 6);
        //System.out.println(kitty.name); // Public -> Så länge vi kan importa
        //System.out.println(kitty.breed); // Protected -> Ej utanför package
        //System.out.println(kitty.age); // Private -> Ej utanför klass

    }  
}
