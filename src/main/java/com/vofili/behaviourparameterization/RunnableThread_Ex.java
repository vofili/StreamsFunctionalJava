package com.vofili.behaviourparameterization;


import java.lang.Runnable;

public class RunnableThread_Ex {

    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("Hello World");
            }
        });

        Thread th2 = new Thread(()-> {System.out.println("Hello Werld");});

        th1.start();
        th2.start();
    }
}
