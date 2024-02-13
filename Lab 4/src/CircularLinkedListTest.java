
class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList s = new CircularLinkedList<>();
        s.addFirst(2);
        s.addLast("3");
        s.addFirst(1.0);
        s.addLast(3.3333);
        s.display();
        s.removeAtPos("3");
        s.display();
    }
}