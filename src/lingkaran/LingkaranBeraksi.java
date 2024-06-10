package lingkaran;

public class LingkaranBeraksi {
    private double luas;

    public LingkaranBeraksi(double luas){
        this.luas = luas;
    }

    public void tampilkanHasil(){
        System.out.println("Bilangan Pecahan : " + luas);
        System.out.println("Bilangan Bulat : " + (int)luas);
        System.out.println("Pembulatan : " + Math.round(luas));
    }
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.hitungLuas(11.78);
    }
}
