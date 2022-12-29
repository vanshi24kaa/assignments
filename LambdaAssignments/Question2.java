package LambdaAssignments;

import java.io.OutputStream;
import java.util.Objects;

public class Question2 {

    public static void main(String[] args) {
        Order od=(int pri)-> {

            if (pri > 10000) {
                System.out.println("Accepted");
            } else{
                System.out.println("Not Accepted");
        }
        };
        od.condition(70000);

    }

        interface Order
        {
            void condition(int p);
        }
    }