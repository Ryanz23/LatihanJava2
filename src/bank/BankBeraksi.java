package bank;

import java.util.Scanner;

public class BankBeraksi {
    Bank bank = new Bank(1000000);

    public void run(){
        System.out.println("Selamat Datang di Bank BCA");
        bank.getSaldo();
        bank.simpanUang(100000);
        bank.ambilUang(50000);
    }
    public static void main(String[]args){
        BankBeraksi bank = new BankBeraksi();
        bank.run();
    }
}
