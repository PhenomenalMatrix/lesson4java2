package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 6; i++) {
            Runner rn = new Runner("runner "+ i);
            rn.setRunnerId(i +1);
            rn.setCode(0);
            rn.start();
            rn.join();
        }
        for (int i = 5; i > 1; i--) {
            Runner rn2 = new Runner("runner " + i);
            rn2.setRunnerIdBack(i - 1);
            rn2.setCode(1);
            rn2.start();
            rn2.join();
        }
        System.out.println("runner 1 берет палочку" );


    }
}

