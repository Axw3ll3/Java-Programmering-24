  
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
        House House = new House(74.6, 4, 1990, "Berggatan 12");
        House.houseDetails();
        Human Human = new Human("Axel", "Construction worker", 21, "Man", 170);
        Human.printHumanDetails();
    }
}


        class Human {
            private String name;
            private String work;
            private int age;
            private String gender;
            private double length;

        public Human(String name, String work, int age, String gender, double length){
            this.name=name;
            this.work=work;
            this.age=age;
            this.gender=gender;
            this.length=length;
        }

        public void printHumanDetails () {
            System.out.println("Name: " +name);
            System.out.println("Work: " +work);
            System.out.println("Age: " +age+ " years old");
            System.out.println("Gender: " +gender);
            System.out.println("Length: " +length+ " cm");
        }


    }


