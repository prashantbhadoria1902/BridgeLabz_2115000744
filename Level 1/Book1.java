class Book1 {
    String title;
    String author;
    double price;
    boolean available;

    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("1991", "Prashant", 15.99);
        book1.borrow();
        book1.borrow();
    }
}
