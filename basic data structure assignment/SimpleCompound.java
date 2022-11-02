import java.util.scanner;

public class SimpleCompound {
    public static void main(String[] args)
    {
        double a, rate, t, sim, com;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Amount");
        a=s.nextInt();
        System.out.println("Enter the no of years:");
        t=s.nextDouble();
        System.out.println("Enter the rate interest");
        rate=s.nextDouble();
        sim=(a*t*rate)/100;
        com=a*Math.pow(1.0+rate/100.0,t)-a;
        System.out.println("Simple Interest is:"+sim);
        System.out.println("Compound Interest is:"+com);

    }
}
