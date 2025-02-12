class Ticket {
    int id;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    Ticket(int id, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.id = id;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    Ticket head = null;

    void addTicket(int id, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(id, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            head.next = head;
            return;
        }
        Ticket temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newTicket;
        newTicket.next = head;
    }

    void removeTicket(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) {
            head = null;
            return;
        }
        Ticket temp = head, prev = null;
        while (temp.next != head && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.id == id) {
            if (temp == head) {
                Ticket last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            } else {
                prev.next = temp.next;
            }
        }
    }

    void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.id + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    Ticket searchTicketByCustomer(String customerName) {
        if (head == null) return null;
        Ticket temp = head;
        do {
            if (temp.customerName.equals(customerName)) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(1, "Alice", "Movie1", "A1", "12:00 PM");
        system.addTicket(2, "Bob", "Movie2", "B2", "2:00 PM");
        system.displayTickets();
        system.removeTicket(1);
        system.displayTickets();
        System.out.println("Total Tickets: " + system.countTickets());
    }
}
