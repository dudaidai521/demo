package com.ujiuye.demo1;

import java.util.HashMap;
import java.util.Properties;
import java.util.Vector;

public class Outer {

    public static void main(String[] args) {
        int a = 12;
        change1(a);
        System.out.println(a);//12
        int[] arr = {4, 5, 6};
        change2(arr);
        System.out.println(arr[0]);//88
    }

    public static void change1(int a) {
        a = 55;
    }

    public static void change2(int[] arr) {
        arr[0] = 88;
    }
}
