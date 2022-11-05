/* annotation program 1 */

import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
    String os();
}
@Test(os="it is a testcase")
class Annotation1
{
    String mode;
    Annotation1(String mode)
    {
        this.mode= mode;
    }
}
class Annotation2
{
    public static void main(String args[]) throws Exception
    {
        Annotation2 n= new Annotation2("test class annotation");
        Class c=n.getClass();
        Test s=(Test)o;
        System.out.println(s.os());
    }
}