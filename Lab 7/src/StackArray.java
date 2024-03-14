public class StackArray {

    private int top;
    private int[] stack;

    StackArray(int capacity){
        stack = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == stack.length - 1;
    }
    public int size(){
        return top + 1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is overflow.");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println("'" + value + "' PUSHED into stack.");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow.");
            return -1;
        }
        int temp = stack[top];
        top--;
        return temp;
    }
    public int top(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }
    public void display(){
        System.out.println("----- Display Method -----");
        if(isEmpty()){
            System.out.println("Stack is empty." +
                    "\n----- -------------- -----");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
        System.out.println("----- -------------- -----");
    }
    public void makeEmpty(){
        if(isEmpty()){
            System.out.println("Stack is already empty.");
        }
        top = -1;
    }
}