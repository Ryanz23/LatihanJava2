package lingkaran;

public class Lingkaran {
    public static final double PI = 3.141592;
    public void hitungLuas(double r){
        double luas = PI * r * r;
        System.out.println("Luas Lingkaran : ");
        new LingkaranBeraksi(luas).tampilkanHasil();
    }
}
