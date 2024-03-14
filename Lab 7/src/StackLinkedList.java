public class StackLinkedList {

    private static class Node {
        private int element;
        private Node next = null;

        public Node(int element, Node next){
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

    private Node top = null;
    private int size = 0;

    public StackLinkedList(){

    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void push(int value){
         Node newNode = new Node(value, top);
         top = newNode;
         size++;
         System.out.println("'" + value + "' PUSHED into stack.");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
            return -1;
        }
        int temp = top.element;
        top = top.next;
        size--;
        return temp;
    }
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }
        return top.element;
    }
    public void display(){
        System.out.println("----- Display Method -----");
        if(isEmpty()){
            System.out.println("Stack is empty." +
                    "\n----- -------------- -----");
            return;
        }
        Node current = top;
        do{
            System.out.println(current.element);
            current = current.next;
        }while(current != null);
        System.out.println("----- -------------- -----");
    }
    public void makeEmpty(){
        if(isEmpty()){
            System.out.println("Stack is already empty.");
            return;
        }
        top.next = null;
        size = 0;
    }
}
