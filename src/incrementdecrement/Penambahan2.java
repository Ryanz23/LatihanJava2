package incrementdecrement;

public class Penambahan2 {
    public static void main(String[] args) {
        int w, x, y, z;
        w = 5;
        x = 5;
        y = 8 - x++;
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        z = 8 - ++w;
        System.out.println(z);
    }
}
