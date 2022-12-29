package Java11Assignments;
import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args)
    {
        String str1 = new String("A ,quick ,brown, fox, jump, over, the, lazy, dog");
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList(str1.split(",")));
        System.out.println(str2);
        System.out.println(str2.get(1));
        System.out.println(str2.get(5));

    }
}