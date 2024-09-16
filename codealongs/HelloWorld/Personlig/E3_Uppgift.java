   
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
            System.out.println(title);
            System.out.println(author);
            System.out.println(year);
        }
    
    
        
    
        
    public static void main(String[] args) {
        Book book = new Book();
        book.printDetails();
    
        }
}
