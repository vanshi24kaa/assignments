package com.string;

public class Reverse {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("This method returns the reversed object on which it was called");
        System.out.println("Before reverse :"+sb);
        sb.reverse();
        System.out.println("After reverse :"+sb);
    }
}