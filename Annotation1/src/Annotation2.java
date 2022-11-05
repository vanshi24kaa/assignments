/* annotation program 1 */

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
    int AuthorId();
    String Date();
    String Time();
    double Version();
}
@info(AuthorId=1002,Date="04-Dec-2022",Time="5:30",Version = 0.8)
class Developer
{
    int size;
    String Date;
    String Time;
    double Version;
    public Developer(int size, String date, String time, double Version)
    {
        this.size = size;
        this.Date = date;
        this.Time = time;
        this.Version = version;
    }
}
public class Annotation2
{
    public static void main(String args[])
    {
        Developer n=new Developer(1002,04-11-2022,"5:30",0.8);
        Class c1=n.getClass();
        Annotation o=c1.getAnnotation(info.class);
        info s=(info)o;
        System.out.println(s.AuthorId());
        System.out.println(s.Date());
        System.out.println(s.Time());
        System.out.println(s.Version());
    }
}
