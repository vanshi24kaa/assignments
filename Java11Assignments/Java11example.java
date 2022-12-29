package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class Java11example {
    public static void main(String[] args) {

        List<Integer> list2 = new LinkedList<>();
        {
            list2.add(1);
            list2.add(2);
            list2.add(3);
            System.out.println(list2);
        }
        Integer[] arr = list2.stream().toArray(size -> new Integer[size]);
        System.out.println(Arrays.toString(arr));
        //files readString and write String
        var path = "C:\\Users\\suschint\\sushma\\check.txt";
        try {
            String data = Files.readString(Path.of(path));
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Files.writeString(Path.of(path),"good morning", StandardOpenOption.APPEND);
        //LOCAL variable syntax for lambda expressions
        String str=" WELCOME\n Good morning";
        System.out.println(str.isBlank());
        System.out.println(str.strip());
        System.out.println(str.repeat(10));
        str.lines().forEach(System.out::println);
    }
}
