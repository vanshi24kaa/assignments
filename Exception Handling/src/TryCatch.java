import java.util.Scanner;

public class TryCatch {
    public static void main(String args[]) {
        int x,y,res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = sc.nextInt();
        System.out.println("Enter the second number: ");
        y = sc.nextInt();
        try {
            res = x/y;
            System.out.println("Result: "+res);
        } catch(ArithmeticException e) {
            System.out.println("Division by Zero!");
        } finally {
            sc.close();
        }
    }
}

