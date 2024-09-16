   
        /*
        class Book {
            private String title;
            private String author;
            private int year;
        
        public Book() {
            title = "Default title";
            author = "Default author";
            year = 2024;
        }
    
        public void printDetails () {
            System.out.println("Title: "+title);
            System.out.println("Author: " +author);
            System.out.println("Year: " +year);
        }
    
    */
        
    
    
    /*
    
    class Student_Class{
        private String name;
        private int age;
        private double grade;
        
        public Student_Class(String name, int age, double grade) {
            this.name=name;
            this.age=age;
            this.grade=grade;
            }
            
            public void printStudentDetails() {
                System.out.println("Name: " +name);
                System.out.println("Age: " + age);
                System.out.println("Grade: "+ grade);
                }
                }
                
                */
                
                class Car {
                    private String make;
                    private String model;
                    private int year;
                    private String color;
                    
                    public Car(String make, String model, int year, String color) {
                        this.make=make;
                        this.model=model;
                        this.year=year;
                        this.color=color;
                        
                    }
                    
                    public Car(String make, String model, int year) {
                        this(make, model, year, "Unknown");
                    }


                    public Car(String make) {
                        this(make, "Unknown", 0, "Unknown");
                    }

                    
                    public void carPrintDetails() {
                        System.out.println("Make: " +make);
                        System.out.println("Model: " +model);
                        System.out.println("Year: " +year);
                        System.out.println("Color: " +color);
                    }
                    
                    
                public static void main(String[] args) {
    
                
                    Car car1 = new Car("Toyota", "Camry", 2022, "Blue");
                    car1.carPrintDetails();
                    
                    Car car2 = new Car("Honda", "Accord", 2023);
                    car2.carPrintDetails();
                    
                    Car car3 = new Car ("Ford");
                    car3.carPrintDetails();
                
                    }
                    
}