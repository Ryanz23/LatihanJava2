package matematika;

import java.util.Scanner;

public class MatematikaCanggihBeraksi{
    public static void main(){
        MatematikaCanggih mc = new MatematikaCanggih();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Modulus");
        System.out.print("input a : ");
        int a = scanner.nextInt();
        System.out.print("input b : ");
        int b = scanner.nextInt();

        mc.setModulus(a,b);
        System.out.println("Hasil " + a + " % " + b + " = " + mc.getModulus());
    }


}
