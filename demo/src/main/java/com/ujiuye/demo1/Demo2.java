package com.ujiuye.demo1;

public class Demo2 {

    //栈内存溢出
    public static void aa() {
        bb();
    }

    public static void bb() {
        aa();
    }

    public static void main(String[] args) {
        //aa();
        //堆内存溢出
        while (true) {
            Long[] arr = new Long[1111111111];
        }
    }
}
