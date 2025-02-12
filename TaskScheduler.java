class Task {
    int id, priority;
    String name, dueDate;
    Task next;

    Task(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head = null;

    void addTask(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (head == null) {
            head = newTask;
            head.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newTask;
        newTask.next = head;
    }

    void removeTask(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) {
            head = null;
            return;
        }
        Task temp = head, prev = null;
        while (temp.next != head && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.id == id) {
            if (temp == head) {
                Task last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            } else {
                prev.next = temp.next;
            }
        }
    }

    void viewCurrentTask() {
        if (head != null) System.out.println(head.id + " " + head.name + " " + head.priority + " " + head.dueDate);
    }

    void moveToNextTask() {
        if (head != null) head = head.next;
    }

    void displayTasks() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    Task searchTask(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask(1, "Task1", 2, "2025-02-15");
        scheduler.addTask(2, "Task2", 1, "2025-02-16");
        scheduler.displayTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();
        scheduler.removeTask(1);
        scheduler.displayTasks();
    }
}
