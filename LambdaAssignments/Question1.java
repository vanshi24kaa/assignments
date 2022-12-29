package LambdaAssignments;

public class Question1 {

    //main method
    public static void main(String[] args) {
        //Lambda Expression
        Addition adding = (int num1 , int num2) -> num1 + num2;
        Subtraction sub = (int num1 , int num2) -> num1 - num2;
        Multiplication mul = (int num1, int num2) -> num1 * num2;
        Division div = (int num1, int num2) -> num1 / num2;

        // print
        System.out.println("Adding num1 & num2 :"+adding.add(6,3));
        System.out.println("Subtract num1 & num2 :"+sub.subtract(6,3));
        System.out.println("Multiply num1 & num2 :"+mul.multiply(6,3));
        System.out.println("Divide num1 & num2 :"+div.divide(6,3));
    }

    // interface for adding
    interface Addition{
        int add(int x1, int y1);
    }

    // interface for subtraction
    interface Subtraction{
        int subtract(int x2, int y2);
    }

    // interface for multiplication
    interface Multiplication{
        int multiply(int x3, int y3);
    }

    // interface for DIVIDE
    interface Division{
        int divide(int x4, int y4);
    }
}
