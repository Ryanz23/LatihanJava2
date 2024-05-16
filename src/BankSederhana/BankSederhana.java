package BankSederhana;

import java.util.Scanner;

public class BankSederhana {

    public static void main(String[]args) {
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
        System.out.println("Apakah anda akan menyimpan uang? (ya/tidak)");
        String jawaban = scanner.next();

        //Jika ya maka program akan meminta untuk input nominal
        if (jawaban.equals("ya")) {
            System.out.println("Silakan isikan nominal yang anda akan simpan disini: ");
            nominal = scanner.nextInt();

            System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + (saldo += nominal));

        //Jika tidak maka akan diarahkan apakah akan mengambil uang atau tidak
        } else if (jawaban.equals("tidak")) {
            System.out.println("Apakah anda akan mengambil uang? (ya/tidak)");
            String jawaban2  = scanner.next();

            //Jika ya maka output akan meminta untuk melakukan input terhadap jumlah nominal
            if (jawaban2.equals("ya")) {
                System.out.println("Silakan isikan nominal yang akan diambil disini: ");
                nominal = scanner.nextInt();

                //Jika nominal melebihi saldo di bank maka output akan langsung menutup program
                if (nominal > saldo) {
                    System.out.println("Maaf saldo anda tidak cukup");
                    System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + saldo);

                //Nominal kurang dari atau sama dengan saldo di bank
                }else if (nominal <= saldo){
                    System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + (saldo -= nominal));
                }

            //Jika tidak maka program akan langsung selesai
            } else if (jawaban2.equals("tidak")) {
                System.out.println("Terima Kasih, Saldo anda sekarang : Rp " + saldo);
            }
        }
    }
}