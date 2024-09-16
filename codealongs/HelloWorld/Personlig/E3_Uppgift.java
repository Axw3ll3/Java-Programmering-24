   
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
    
        }
}

/*
    class Student_Class{
        private String name;
        private int age;
        private double grade;
    }
        */