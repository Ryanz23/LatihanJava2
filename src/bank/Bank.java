package bank;

public class Bank {
    int saldo;

    public Bank(int saldo){
        this.saldo = saldo;
    }
    public void simpanUang(int jumlah){
        saldo += jumlah;
        System.out.println("Simpan Uang : Rp. " + jumlah);
        System.out.println("Saldo saat ini : Rp. " + saldo);
    }
    public void ambilUang(int jumlah){
        if (jumlah > saldo){
            System.out.println("Saldo tidak mencukupi");
        }else {
            saldo -= jumlah;
            System.out.println("Ambil uang : Rp. " + jumlah);
            System.out.println("Saldo saat ini : Rp. " + saldo);
        }
    }
    public void getSaldo(){
        System.out.println("Saldo saat ini : Rp. " + saldo);
    }
}
