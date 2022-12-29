package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class firstletterreplace implements UnaryOperator<String>
{
    public String apply(String word)
    {
        return word.toUpperCase();
    }
}
public class Lambda6
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<String> list=new ArrayList<String>();
        {
            list.add("java");
            list.add("oops");
            list.add("mongodb");
            list.add("git");
            System.out.println("words in the list are"+list);
            list.replaceAll( new firstletterreplace());
            System.out.println("words after replacing"+list);
        }
    }
}
