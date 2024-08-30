package codealongs.HelloWorld.Personlig;
import java.util.Scanner; 

public class JavaPlayground {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Hej och välkommen till denna simulation");
        System.out.println("Idag ska vi ta reda på om du är tillräckligt gammal för att kunna delta i denna övning");


        System.out.println("Var snäll och skriv in din ålder!");
        int age;

        if (sc.hasNextInt()) {
            age = sc.nextInt();
            System.out.println(age);

            if (age >= 18) {
                System.out.println("Du är godkänd");
            }
    
            else if (age < 18) {
                System.out.println("Du är för ung för denna övning");
            }
        }

        else {
            System.out.println("Icke godkänd input");
        }


        sc.close();
    }
    
}
