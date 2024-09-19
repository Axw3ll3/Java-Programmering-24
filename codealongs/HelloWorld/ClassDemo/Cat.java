package ClassDemo;

public class Cat {
    public String name; // Från hela vårt projekt
    protected String breed; // Från hela vårt package
    private int age; // Från endast denna klass

    // Default constructor
    public Cat(){
        this("Unknown", "Unknown");
    }

    public Cat(String name, String breed){
        this(name,breed,1);
    }

    public Cat(String name, int age){
        this(name, "Unknown", age);
    }

    public Cat(int age, String breed){
        this("Unknown", breed, age);
    }

    public Cat(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args){
        Cat kosmos = new Cat("Kosmos", "Bondkatt", 6);
        printValues(kosmos);
    
    }

    // Metod för att printa ut varje värde ur ett katt-objekt 
    public static void printValues(Cat catObject){
        System.out.println("name: "+ catObject.name);
        System.out.println("breed: "+ catObject.breed);
        System.out.println("age: "+ catObject.age);
        System.out.println();

    }
    
}
