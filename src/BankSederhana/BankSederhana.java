package BankSederhana;

import bank.Bank;

import java.util.Scanner;

public class BankSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int saldo = 1000000;
        int nominal;

        //Welcome
        System.out.println("Bank Sederhana");
        System.out.print("Masukkan nama anda : ");
        nama = scanner.nextLine();
        System.out.println("Selamat Pagi, " + nama);
        System.out.println("Saldo Anda Saat Ini adalah Rp " + saldo);

        //Input jumlah uang yang akan disimpan
        System.out.println("Silakan isikan nominal yang anda akan simpan disini: ");
        nominal = scanner.nextInt();
        System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + (saldo += nominal));

        //Ambil uang
        System.out.println("Apakah anda akan mengambil uang? (ya/tidak)");
        scanner.nextBoolean();

        //Jika ya maka output akan meminta untuk melakukan input terhadap jumlah nominal
        if (true) {
            System.out.println("Silakan isikan nominal yang akan diambil disini: ");
            nominal = scanner.nextInt();

            //Jika nominal melebihi saldo di bank maka output akan langsung menutup program
            if (nominal > saldo) {
                System.out.println("Maaf saldo anda tidak cukup");
                System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + saldo);
            }else {
                System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + (saldo -= nominal));
            }
        }else { //Jika tidak melakukan pengambilan uang output langsung menutup program
            System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + saldo);
        }
    }
}