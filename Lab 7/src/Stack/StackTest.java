public class StackTest {
    public static void main(String[] args) {
        StackArray S1 = new StackArray(5);
        S1.push(1);
        System.out.println("Top is: " + S1.top());
        S1.push(2);
        System.out.println("Top is: " + S1.top());
        S1.push(3);
        System.out.println("Top is: " + S1.top());
        S1.push(4);
        System.out.println("Top is: " + S1.top());
        S1.push(5);
        System.out.println("Top is: " + S1.top());
        S1.display();
        StackLinkedList S2 = new StackLinkedList();
        S2.push(S1.pop());
        S2.push(S1.pop());
        S2.push(S1.pop());
        S2.push(S1.pop());
        S2.push(S1.pop());
        S2.display();
        S2.makeEmpty();
        S2.display();
    }
}