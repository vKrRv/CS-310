import java.util.Scanner;

public class MissingBracketsCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an equation to check if its brackets balanced:");
        String str = in.nextLine();

    }


    public boolean isBalanced(String str){
        StackLinkedList stk = new StackLinkedList();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stk.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(stk.isEmpty()){
                    return false;
                }

            }
            else
        }
    }
}