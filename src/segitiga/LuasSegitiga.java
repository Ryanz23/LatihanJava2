package segitiga;

public class LuasSegitiga {
    public static void main(String[] args) {
        int alas = 3;
        int tinggi = 7;
        double luas = (double) (alas * tinggi) / 2;
        luas = Math.round(luas);
        System.out.println("Luas Segitiga : " + luas);
    }
}
