class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = this.prev = null;
    }
}

class MovieLinkedList {
    Movie head, tail;

    void addMovie(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    void removeMovie(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) temp = temp.next;
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    Movie searchMovie(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieLinkedList list = new MovieLinkedList();
        list.addMovie("Inception", "Nolan", 2010, 8.8);
        list.addMovie("Interstellar", "Nolan", 2014, 8.6);
        list.displayForward();
        list.updateRating("Inception", 9.0);
        list.displayForward();
        list.removeMovie("Interstellar");
        list.displayForward();
        list.displayReverse();
    }
}
