public class SinglyLinkedList<E> {
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
    public SinglyLinkedList() {}

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
            while(current != null){
                counter++;
                System.out.println("#" + counter + "- " + current.element + "\t");
                current = current.next;
            }
        }
    }
    public void find(E value){
        Node<E> current = head;
        int counter = 0;
        while(current != null){
            counter++;
            if(current.element.equals(value)){
                System.out.println("Found value at node #" + counter);
                return;
            }
            current = current.next;
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<E>(e, head);
        head = newNode;
        if(size == 0) tail = head;
        size++;
    }
    public void addLast(E e){
        Node<E> newNode = new Node<E>(e, null);
        tail.next = newNode;
        tail = newNode;
        if(size == 0) head = tail;
        size++;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        System.out.println("First node is successfully deleted");
        size--;
        if(isEmpty()) tail = null;
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
            if(current.next == null){
                System.out.println("Value doesn't exist!");
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
            System.out.println("#" + counter + "Node is successfully deleted");
            size--;
        }

    }
}