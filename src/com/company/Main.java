package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
            MyThread th = new MyThread();
                th.start();
                th.join();
    }
}

