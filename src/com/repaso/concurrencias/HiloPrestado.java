package com.repaso.concurrencias;

public class HiloPrestado implements Runnable {
    @Override
    public void run() {
        Long contador = 750l;
        while(true){
            System.out.println(++contador + " Segundos ");
            try {
                Thread.sleep(750L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
