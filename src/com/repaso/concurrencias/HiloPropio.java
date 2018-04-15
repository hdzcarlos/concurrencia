package com.repaso.concurrencias;


public class HiloPropio extends Thread {

    @Override
    public void run() {
        Long contador = 0l;
        while(true){
            System.out.println(++contador + " Segundos ");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

