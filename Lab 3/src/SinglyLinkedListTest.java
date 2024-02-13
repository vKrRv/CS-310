class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();
        s.addFirst("IAU");
        s.addFirst(2322);
        s.display();
        s.find(2322);
    }
}