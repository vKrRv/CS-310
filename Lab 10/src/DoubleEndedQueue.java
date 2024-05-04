public class DoubleEndedQueue {
    private static class Node{
        private Node prev;
        private int element;
        private Node next;

        public Node(Node prev, int element, Node next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
        public void setElement(int element) {
            this.element = element;
        }
        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }
        public int getElement() {
            return element;
        }
        public Node getNext() {
            return next;
        }
    }

    private Node front = null;
    private Node rear = null;
    private int size = 0;
    public DoubleEndedQueue() {}

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String getFront(){
        return "Front is: " + front.element;
    }
    public String getRear(){
        return "Rear is: " + rear.element;
    }

    public void EnQueueRear(int value){
        Node newNode = new Node(null, value, null);
        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        System.out.println(value + " is enqueued");
    }
    public void EnQueueFront(int value){
        Node newNode = new Node(null, value, null);
        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            front.prev = newNode;
            newNode.next = front;
            front = newNode;
        }
        size++;
        System.out.println(value + " is enqueued");
    }
    public void DeQueueRear(){
        if(isEmpty()){
            System.out.println("Queue is underflow");
            return;
        }
        int temp = rear.element;
        rear = rear.prev;
        if (rear != null) {
            rear.next = null;
        } else {
            front = null; // Queue is now empty
        }
        size--;
        if(isEmpty()){
            rear = null;
        }
        System.out.println(temp + " is dequeued");
    }
    public void DeQueueFront(){
        if(isEmpty()){
            System.out.println("Queue is underflow");
            return;
        }
        int temp = front.element;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null; // Queue is now empty
        }        size--;
        if(isEmpty()){
            rear = null;
        }
        System.out.println(temp + " is dequeued");
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while(current != null){
            System.out.print(current.element + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleEndedQueue q = new DoubleEndedQueue();
        q.EnQueueFront(5);
        q.EnQueueFront(3);
        q.EnQueueRear(7);
        q.display();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.DeQueueFront();
        q.DeQueueRear();
        System.out.println("Size is: " + q.size());
        q.display();
        q.DeQueueRear();
        System.out.println("isEmpty: " + q.isEmpty());
    }
}
