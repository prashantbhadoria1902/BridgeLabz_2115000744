class Book{
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private final int isbn;

    public Book(String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }

    public void displayDetails(){
        if(this instanceof Book){
            System.out.println("Title of the book: "+title);
            System.out.println("Author of the book: "+author);
            System.out.println("ISBN of the book: "+isbn);
            System.out.println("Library: "+libraryName);
        }
    }

    public static void main(String[] args){
        Book b1 = new Book("Three Men in a Boat","Prashant",1234);
        Book.displayLibraryName();
        b1.displayDetails();
    }
}