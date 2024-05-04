public class LinkedListQueue {
    private static class Node {
        private int element;
        private Node next;

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }

        public void setElement(int element) {
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

    private Node front = null;
    private Node rear = null;
    private int size = 0;
    public LinkedListQueue() {}

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public Node getFront(){
        return front;
    }
    public Node getRear(){
        return rear;
    }

    public void EnQueue(int value){
        Node newNode = new Node(value, null);
        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(value + " is enqueued");
    }
    public void DeQueue(){
        if(isEmpty()){
            System.out.println("Queue is underflow");
            return;
        }
        int temp = front.element;
        front = front.next;
        size--;
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
        LinkedListQueue q = new LinkedListQueue();
        q.EnQueue(1);
        q.EnQueue(2);
        q.EnQueue(3);
        q.EnQueue(4);
        q.EnQueue(5);
        q.display();
        q.DeQueue();
        q.DeQueue();
        q.DeQueue();
        q.display();
        q.EnQueue(6);
        q.display();
    }
}