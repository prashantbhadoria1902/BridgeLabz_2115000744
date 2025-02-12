class TextState {
    String content;
    TextState next, prev;

    TextState(String content) {
        this.content = content;
        this.next = this.prev = null;
    }
}

class TextEditor {
    TextState head, current;
    int historyLimit = 10;
    int count = 0;

    void addState(String content) {
        TextState newState = new TextState(content);
        if (head == null) {
            head = current = newState;
        } else {
            current.next = newState;
            newState.prev = current;
            current = newState;
            count++;
            if (count > historyLimit) {
                head = head.next;
                head.prev = null;
                count--;
            }
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrentState() {
        if (current != null) System.out.println("Current State: " + current.content);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
