class Process {
    int id, burstTime, priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    int timeQuantum = 2;

    void addProcess(int id, int burstTime, int priority) {
        Process newProcess = new Process(id, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head;
            return;
        }
        Process temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newProcess;
        newProcess.next = head;
    }

    void removeProcess(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) {
            head = null;
            return;
        }
        Process temp = head, prev = null;
        while (temp.next != head && temp.id != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp.id == id) {
            if (temp == head) {
                Process last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            } else {
                prev.next = temp.next;
            }
        }
    }

    void executeProcesses() {
        if (head == null) return;
        Process temp = head;
        while (true) {
            if (temp.burstTime > 0) {
                int executeTime = Math.min(timeQuantum, temp.burstTime);
                temp.burstTime -= executeTime;
                System.out.println("Executing Process " + temp.id + " for " + executeTime + " units");
                if (temp.burstTime == 0) removeProcess(temp.id);
            }
            temp = temp.next;
            if (head == null) break;
        }
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println(temp.id + " " + temp.burstTime + " " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 5, 2);
        scheduler.addProcess(2, 3, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.displayProcesses();
        scheduler.executeProcesses();
        scheduler.displayProcesses();
    }
}
