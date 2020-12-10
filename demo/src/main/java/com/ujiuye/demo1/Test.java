package com.ujiuye.demo1;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread() {
            public void run() {
                System.out.println("pong");
            }
        };
        System.out.println("ping");
        t.start();
        System.out.println("ping");


        String str = "hello";
        byte[] bytes = str.getBytes();

        String s = bytes.toString();

        str = new String(bytes);


    }
}
