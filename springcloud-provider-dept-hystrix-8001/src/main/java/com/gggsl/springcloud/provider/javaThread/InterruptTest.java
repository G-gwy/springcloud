package com.gggsl.springcloud.provider.javaThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class InterruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("t1 start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1 end");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2 start");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2 end");
        });

        //ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 8, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
        /*executor.execute(t1);
        executor.execute(t2);
        System.out.println("main end");*/
        T3 t3 = new T3();
        t3.start();

    }
}
class T3 extends Thread{
    @Override
    public void run() {
        System.out.println("t3 start");
        try {
            int i=0;
            while (true) {
                i++;
                this.interrupt();
                System.out.println("111"+this.isInterrupted());
                if (this.isInterrupted()) {
                    break;
                }
                System.out.println(i);
            }
            System.out.println("222"+this.isInterrupted());
            Thread.sleep(6000);
            System.out.println("333"+this.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("444"+this.isInterrupted());
    }
}