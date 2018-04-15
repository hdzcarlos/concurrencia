package com.repaso.concurrencias;

public class Main {

    public static void main(String[] args) {
       Thread hilo = new HiloPropio();
        Thread hilo2 = new HiloNuevo();
        Thread hilo3 = new Thread(new HiloPrestado());
        hilo2.start();
        hilo3.start();
        hilo.start();
        Thread hilo4 = new Thread(() -> {
            Long contador = 2000l;
            while(true){
                System.out.println(++contador + " biSegundos ");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        hilo4.start();


    }
}
