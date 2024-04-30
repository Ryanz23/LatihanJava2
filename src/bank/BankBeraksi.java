package bank;

public class BankBeraksi {
    Bank bank = new Bank(100000);

    public void run(){
        System.out.println("Selamat Datang di Bank BCA");
        bank.getSaldo();
        bank.simpanUang(500000);
        bank.ambilUang(150000);
    }
    public static void main(String[]args){
        BankBeraksi bank = new BankBeraksi();
        bank.run();
    }
}
