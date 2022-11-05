import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.util.ArrayList;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Execute {
    int Sequence();
}
class MyClass {
    @Execute(Sequence = 2)
    public void myMethod1() {
        System.out.println("Method 1");
    }

    @Execute(Sequence = 1)
    public void myMethod2() {
        System.out.println("Method 2");

    }

    @Execute(Sequence = 3)
    public void myMethod3() {
        System.out.println("Method 3");
    }
}

