package com.springboot.sendemail.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: sanfenwu
 * @Date: 2022/1/7 0007
 */
public  class Test555 extends ClassLoader{

    static  int j=0;

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,100,3,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        for (int i=0;i<100;i++){
            executor.execute(new Runnable() {
                @Override
                public synchronized  void run() {
                    System.out.println(j++);
                }
            });

        }
        executor.shutdown();
    }
}
