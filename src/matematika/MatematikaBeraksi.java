package matematika;

import java.util.Scanner;

public class MatematikaBeraksi {
    public static void main(String[]args){
        Matematika matematika = new Matematika();
        Scanner scanner = new Scanner(System.in);

        //setPertambahan
        //input variable
        System.out.print("Input a : ");
        int a = scanner.nextInt();
        System.out.print("Input b : ");
        int b = scanner.nextInt();

        matematika.setPertambahan(a, b);
        System.out.println("Hasil " + a + " + " + b + " = " + matematika.getPertambahan());

        //setPengurangan
        //input variable
        System.out.print("Input a : ");
        a = scanner.nextInt();
        System.out.print("Input b : ");
        b = scanner.nextInt();

        matematika.setPengurangan(a, b);
        System.out.println("Hasil " + a + " - " + b + " = " + matematika.getPengurangan());

        //setPerkalian
        //input variable
        System.out.print("Input a : ");
        a = scanner.nextInt();
        System.out.print("Input b : ");
        b = scanner.nextInt();

        matematika.setPerkalian(a, b);
        System.out.println("Hasil " + a + " * " + b + " = " + matematika.getPerkalian());

        //setPembagian
        System.out.print("Input a : ");
        a = scanner.nextInt();
        System.out.print("Input b : ");
        b = scanner.nextInt();

        matematika.setPembagian(a,b);
        System.out.println("Hasil " + a + " / " + b + " = " + matematika.getPembagian());
    }
}
