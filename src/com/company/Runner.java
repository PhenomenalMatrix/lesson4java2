package com.company;

public class Runner extends Thread {


    public Runner(String name) {
        super(name);
    }

    private int runnerId;
    private int runnerIdBack;
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }

    public int getRunnerIdBack() {
        return runnerIdBack;
    }

    public void setRunnerIdBack(int runnerIdBack) {
        this.runnerIdBack = runnerIdBack;
    }

    public void run() {
        try {
            if (getCode() == 0) {
                if (getRunnerId() == 6) {
                    System.out.println(this.getName() + " берет палочку");
                    System.out.println(this.getName() + " перешел финиш");
                } else {
                    System.out.println(this.getName() + " берет палочку");
                    System.out.println(this.getName() + " бежит к  раннеру " + getRunnerId());
                }
            } else {
                if (getRunnerIdBack() < 6 ) {
                    System.out.println(this.getName() + " бежит к  раннеру " + getRunnerIdBack());
                    System.out.println(this.getName() + " берет палочку");
                    if (getRunnerIdBack() == 5) {
                        System.out.println(this.getName() + " бежит к  раннеру " + getRunnerIdBack());
                    }
               }
            }
            sleep(1000);
        } catch (InterruptedException ie) {

        }

    }
}
