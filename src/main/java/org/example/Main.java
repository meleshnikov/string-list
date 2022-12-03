package org.example;

import org.example.list.IntegerArrayList;
import org.example.list.StringArrayList;

public class Main {
    public static void main(String[] args) {

        StringArrayList strings = new StringArrayList();
        strings.add("hello");
        String s1 = strings.addE("world");
        String s2 = strings.addE(1, "this");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(strings);
        String s3 = strings.removeE("hello");
        System.out.println(s3);
        System.out.println(strings);

        IntegerArrayList integers = new IntegerArrayList();
        int a = integers.addE(2);
        int b = integers.addE(1, 5);
        System.out.printf("%d %d%n", a, b);
        System.out.println(integers);
        integers.removeE(6);

    }
}