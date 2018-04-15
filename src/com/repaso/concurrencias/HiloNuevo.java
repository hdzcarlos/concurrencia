package com.repaso.concurrencias;

public class HiloNuevo extends Thread {
    @Override
    public void run() {
        Long contador = 0l;
        while(true){
            contador += 500;
            System.out.println(++contador + " Segundos ");
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
