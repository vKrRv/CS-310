public class CircularLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public CircularLinkedList() {}

    public int size(){
        return size; }
    public boolean isEmpty(){
        return size == 0; }
    public E first() {
        return head.element; }
    public E last(){
        return tail.element; }
    public void display(){
        Node<E> current = head;
        int counter = 0;
        if(isEmpty()){
            System.out.println("Linked list is empty!");
        }
        else {
            do{
                counter++;
                System.out.println("#" + counter + "- " + current.element + "\t");
                current = current.next;
            }while(current != head);
        }
    }
    //Searching
    public void find(E value){
        Node<E> current = head;
        int counter = 0;
        do{
            counter++;
            if(current.element.equals(value)){
                System.out.println("Found value at node #" + counter);
                return;
            }
            current = current.next;
        }while(current != head);
        System.out.println("Value doesn't exist!");
    }
    //Insertion
    public void addFirst(E e){
        Node<E> newNode = new Node<E>(e, head);
        head = newNode;
        if(size == 0) tail = head;
        tail.next = head;
        size++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<E>(e, head);
        if(size == 0){ head = newNode; tail = newNode;}
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    //Deletion
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        tail.next = head;
        System.out.println("First node is successfully deleted");
        size--;
        if(isEmpty()){ tail = null; head = null;}
    }
    public void removeAtPos(E value){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node<E> current = head;
        Node<E> prev = head;
        int counter = 0;
        while(!current.element.equals(value)){
            counter++;
            if(current.next == head){
                System.out.println("Value not found");
                return;
            }
            else {
                prev = current;
                current = current.next;
            }
        }
        if(current == head) removeFirst();
        else{
            prev.next = current.next;
            System.out.println("Node #" + counter + " is successfully deleted");
            size--;
        }
    } //It should remove value from position but is does delete by value given

}