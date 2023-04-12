package org.example;

public class CheakBalance implements Runnable{
    private int balance;
    @Override
    public void run() {
        if(balance > 60000)
            System.out.println(Thread.currentThread().getName() + " " + "Счет заблокирован из-за больших денег " + balance);
        else System.out.println(Thread.currentThread().getName() + " " + "Проверка пройдена на вашем счету " + balance + "руб.");
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
