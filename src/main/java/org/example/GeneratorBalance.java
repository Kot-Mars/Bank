package org.example;

import java.util.Random;

public class GeneratorBalance implements Runnable{
    final Random random = new Random();
    private int balance;
    @Override
    public void run() {
        balance = random.nextInt(1000000);
        System.out.println(Thread.currentThread().getName() + " " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
