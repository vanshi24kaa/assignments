public class Lambda1 {
    @FunctionalInterface
    interface Arithmetic
    {
        int operations(int a,int b);
    }

        public static void main(String args[])
        {
            Arithmetic addition = (a, b) -> (a + b);
            System.out.println("Addition = " + addition.operations(5,10));
            Arithmetic subtraction = (a, b) -> (a - b);
            System.out.println("Subtraction = " + subtraction.operations(5,10));
            Arithmetic multiplication = (a, b) -> (a * b);
            System.out.println("Multiplication = " + multiplication.operations(5,10));
            Arithmetic division = (a, b) -> (a / b);
            System.out.println("Division = " + division.operations(5,10));

        }
    }

