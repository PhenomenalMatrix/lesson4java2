package com.company;

public class MyThread extends Thread {

    public void run(){

        for (int i = 1; i < 6 ; i++) {

        try{
            if(i < 5 ){

                System.out.println("Раннер   " + i + " берет палочку");
                System.out.println("Раннер   "+ i +" передает палочку " + "Ранеру  " + (i + 1));
            }else {
                System.out.println("Раннер   " + i + " берет палочку");
                System.out.println("Раннер  " + i + " перешел финиш");
                if (i ==5){
                    for (int j = 5; j > 0; j--) {
                        if (j ==5 && j>0) {
                        System.out.println("Раннер   " + j + " передает палочку " + "Ранеру  " + (j - 1));
                        sleep(1000);
                        } else if (j<5 && j!=1){
                        System.out.println("Раннер   " + j + " берет палочку");
                        System.out.println("Раннер   " + j + " передает палочку " + "Ранеру  " + (j - 1));
                        sleep(1000);

                        }else if (j == 1){
                            System.out.println("Раннер   " + j + " берет палочку");

                        }
                    }

                }

            }
            sleep(1000);
        }catch (InterruptedException ie){

        }
    }
  }
}
