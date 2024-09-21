  
    class House {
        private double area;
        private int floors;
        private int buildYear;
        private String adress;
        
        public House(double area, int floors, int buildYear, String adress) {
            this.area=area;
            this.floors=floors;
            this.buildYear=buildYear;
            this.adress=adress;
        }
        
        public void houseDetails() {
            System.out.println("House area: " +area+ " cm^2");
            System.out.println("Amount of floors: " +floors);
            System.out.println("Year the house was built: "+buildYear);
            System.out.println("House adress: " +adress);
        }
    
    
        public static void main(String[] args) {
        House House1 = new House(74.6, 4, 1990, "Berggatan 12");
        House House2 = new House (56.2, 2, 2010, "Bullerbyvägen 56");
        House House3 = new House (100.5, 6, 2015, "Klubbhusgatan 27");
        
        /*
        House1.houseDetails();
        System.out.println("");
        House2.houseDetails();
        System.out.println("");
        House3.houseDetails();
        System.out.println("");
        */
        Human Human1 = new Human("Axel", "Construction worker", 21, "Man", 170, House1);
        Human1.printHumanDetails();
        System.out.println("");

        Human Human2 = new Human("Karl", "Programmer", 32, "Man", 186, House2);
        Human2.printHumanDetails();
        System.out.println("");

        Human Human3 = new Human("Tilda", "Editor", 27, "Woman", 167, House3);
        Human3.printHumanDetails();
        System.out.println("");
    }
}


        class Human {
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
            System.out.println("House: " +house);
        }


    }


