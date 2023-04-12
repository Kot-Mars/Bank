package org.example;

public class Main {
    public static void main(String[] args) {
        GeneratorBalance generatorBalance = new GeneratorBalance();
        Thread generatorThread = new Thread(generatorBalance, "Generator");
        CheakBalance cheakBalance = new CheakBalance();
        Thread cheakThread = new Thread(cheakBalance, "Cheak");
        generatorThread.start();
        cheakBalance.setBalance(generatorBalance.getBalance());
        cheakThread.start();
    }
}