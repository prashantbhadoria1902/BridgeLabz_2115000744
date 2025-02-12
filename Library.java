class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;

    Book(int id, String title, String author, String genre, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = this.prev = null;
    }
}

class Library {
    Book head, tail;

    void addBook(int id, String title, String author, String genre, boolean available) {
        Book newBook = new Book(id, title, author, genre, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    void removeBook(int id) {
        Book temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    Book searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) return temp;
            temp = temp.next;
        }
        return null;
    }

    Book searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateAvailability(int id, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.prev;
        }
    }

    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(1, "Book1", "Author1", "Fiction", true);
        library.addBook(2, "Book2", "Author2", "Non-Fiction", false);
        library.displayForward();
        library.updateAvailability(1, false);
        library.displayForward();
        library.removeBook(2);
        library.displayForward();
        System.out.println("Total Books: " + library.countBooks());
    }
}
