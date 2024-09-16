   
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
    
    
        
    
        
    public static void main(String[] args) {
        Book book = new Book();
        book.printDetails();
        Student_Class Student = new Student_Class("Axel", 12, 3.4);
        Student.printStudentDetails();
    
        }
    }


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
        


    class Car_Class {
        private String make;
        private String model;
        private int year;
        private String color;

    public Car_Class(String make, String model, int year, String color) {
        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;

    }
    }