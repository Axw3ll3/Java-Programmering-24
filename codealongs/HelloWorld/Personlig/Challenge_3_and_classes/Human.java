package Challenge_3_and_classes;

public class Human {
        private String name;
        private String work;
        private int age;
        private String gender;
        private double length;
        private House house;

    public Human(String name, String work, int age, String gender, double length, House house){
        this.name=name;
        this.work=work;
        this.age=age;
        this.gender=gender;
        this.length=length;
        this.house=house;
    }

    public void printHumanDetails () {
        System.out.println("Name: " +name);
        System.out.println("Work: " +work);
        System.out.println("Age: " +age+ " years old");
        System.out.println("Gender: " +gender);
        System.out.println("Length: " +length+ " cm");
        System.out.println("Housereference: " +house);
    }    
}
