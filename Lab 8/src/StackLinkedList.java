public class StackLinkedList {

    private static class Node {
        private char element;
        private Node next = null;

        public Node(char element, Node next) {
            this.element = element;
            this.next = next;
        }

        public void setElement(char element) {
            this.element = element;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node top = null;
    private int size = 0;

    public StackLinkedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(char value) {
        Node newNode = new Node(value, top);
        top = newNode;
        size++;
        System.out.println("'" + value + "' PUSHED into stack.");
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
            return '\0';
        }
        char temp = top.element;
        top = top.next;
        size--;
        return temp;
    }

    public char top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        }
        return top.element;
    }

    public void display() {
        System.out.println("----- Display Method -----");
        if (isEmpty()) {
            System.out.println("Stack is empty." +
                    "\n----- -------------- -----");
            return;
        }
        Node current = top;
        do {
            System.out.println(current.element);
            current = current.next;
        } while (current != null);
        System.out.println("----- -------------- -----");
    }

    public void makeEmpty() {
        if (isEmpty()) {
            System.out.println("Stack is already empty.");
            return;
        }
        top.next = null;
        size = 0;
    }
}
