package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class list
{
    int number;
   list(int number)
    {
        this.number=number;
    }

    @Override
    public String toString() {
        return "list{" +
                "number=" + number +
                '}';
    }
}
public class Lamda8
{
    public static void main(String[] args)
    {
        list n1=new list(10);
        list n2=new list(20);
        list n3=new list(30);
        list n4=new list(40);
        List<list> l=new ArrayList<>();
        {
            l.add(n1);
            l.add(n2);
            l.add(n3);
            l.add(n4);
           System.out.println("printing all elements");
         int n=l.size();
           printList(l,number->
           {
               for(int i=0;i<=n;i++)
               {

                       System.out.println(l.get(i));
               }
           });
        }
    }
    private static void printList(List<list> l,Consumer<list> consumer)
    {
        for(list number:l)
        {
            consumer.accept(number);
        }
    }
}
