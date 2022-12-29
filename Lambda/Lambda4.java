package com.company;

import java.util.ArrayList;
public class Lambda4
{
    public static void main(String[] args)
    {
        ArrayList<String> l = new ArrayList<>();
        {
            l.add("abc");
            l.add("njy");
            l.add("tree");
            l.add("nhg");
            for(String n:l)
            System.out.println(n.length());
            l.removeIf(n -> ((n.length()%2) != 0));
            for(String n : l) {
                System.out.println(n);
            }
        }
    }
}

