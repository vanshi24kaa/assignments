package Java11Assignments;
import java.util.stream.IntStream;

public class Question1 {

    public static void main(String[] args)
    {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

}
