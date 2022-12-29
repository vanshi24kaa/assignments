import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
    interface Inter
    {
        public void test(int n);
    }
    public class Lambda3
    {
        public static void main(String args[])
        {
            Predicate<Integer> P = n -> n%2 == 0;
            System.out.println(P.test(10));
            Function<Integer,Integer> F = n -> n*n;
            System.out.println(F.apply(6));
            Supplier<Date> S = () -> new Date();
            System.out.println(S.get());
            Consumer<String> C = (string) -> System.out.println(4);
            C.accept("paru");
        }
    }

