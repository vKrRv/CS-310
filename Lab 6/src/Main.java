import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter (int) value to sum its digits:");
        int value = in.nextInt();
        System.out.println("The sum of " + value + " digits = " +  sum(value));
    }
    public static int sum(int value){
        if(value == 0){
            return 0;
        }
        return value % 10 + sum(value / 10);
    }
}