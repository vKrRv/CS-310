
public class CircularDoubleLinkedList<E> {

    private static class Node<E>{
        private Node<E> prev;
        private E element;
        private Node<E> next;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
        public void setElement(E element) {
            this.element = element;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
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
    public CircularDoubleLinkedList(){};

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        return head.element;
    }
    public E last(){
        return tail.element;
    }

    public void fDisplay(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node<E> current = head;
        int counter = 0;
        do{
            counter++;
            System.out.println("#" + counter + "\t" + current.element);
            current = current.next;
        } while (current != head);
    } //Forward traverse
    public void bDisplay(){ //Backward traverse
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node<E> current = tail;
        int counter = size;
        do{
            System.out.println("#" + counter + "\t" + current.element);
            counter--;
            current = current.prev;
        } while (current != tail);
    } //Backward traverse
    public void find(E value){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node<E> current = head;
        int counter = 0;
        do{
            counter++;
            if(current.element.equals(value)){
                System.out.println("Element found at pos #" + counter);
                return;
            }
            current = current.next;
        } while (!current.equals(head));
    }

    public void addFirst(E value){
        Node<E> newNode = new Node<>(tail, value, head);
        head.prev = newNode;
        head = newNode;
        tail.next = head;
        size++;
    }
    public void addLast(E value){
        Node<E> newNode = new Node<>(tail, value, head);
        tail.next = newNode;
        tail = newNode;
        head.prev = tail;
        size++;
    }
    public void addAtPos(E value, int pos){
        if(pos > size || pos <= 0){
            System.out.println("Position out of bound");
        } else if(pos == 1) {
            addFirst(value);
        } else if(pos == size) {
            addLast(value);
        }
        else {
            Node<E> current = head;
            int counter = 0;
            for(int i = 1; i < pos - 1; i++){
                current = current.next;
            }
            Node<E> newNode = new Node<>(current, value, current.next);
            current.next = newNode;
            size++;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(size == 1) head = tail = null;
            /*Same as "if(isEmpty) head = tail = null;" (after deletion and decreasing the size)*/
        else {
            head = head.next;
            tail.next = head;
            head.prev = tail;
        }
        size--;
        /*if(isEmpty) head = tail = null;^*/
    }
    public void deleteLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(size == 1) head = tail = null;
            /*Same as "if(isEmpty) head = tail = null;" (after deletion and decreasing the size)*/
        else {
           tail = tail.prev;
           tail.next = head;
           head.prev = tail;
        }
        size--;
        /*if(isEmpty) head = tail = null;^*/
    }
    public void deleteAtPos(int pos){
        if(pos > size || pos <= 0){
            System.out.println("Position out of bound");
        }
        else if(pos == 1) {
            deleteFirst();
        } else if(pos == size) {
            deleteLast();
        }
        else {
            Node<E> current = head;
            Node<E> prev = head;
            for(int i = 1; i < pos - 1; i++){
                current = current.next;
                prev = current;
            }
            prev.next = current.next;
            current.next.prev = prev;
            size--;
        }
    }


}