package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
            Runner th = new Runner();
                th.start();
                th.join();
    }
}

