package com.company;
        import java.util.*;
public class Stringopre {
    public static void main(String[] args) {
        String a="java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('a','$'));
        String b="Java String Pool Refers To Collection Of Strings Which Are Stored In Heap Memory";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}
