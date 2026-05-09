package assignment_9;

import java.util.Scanner;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount + " ; Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println(Thread.currentThread().getName() +
                        " Waiting... Insufficient balance!");
                wait();
            } catch (InterruptedException e) {}
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() +
                " Withdrew: " + amount + " ; Balance: " + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();

        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();

        System.out.print("Enter withdraw amount: ");
        int withdrawAmount = sc.nextInt();

        BankAccount account = new BankAccount(initialBalance);

        Thread depositThread = new Thread(() -> {
            account.deposit(depositAmount);
        }, "Deposit-Thread");

        Thread withdrawThread = new Thread(() -> {
            account.withdraw(withdrawAmount);
        }, "Withdraw-Thread");

        withdrawThread.start();
        depositThread.start();

        sc.close();
    }
}

