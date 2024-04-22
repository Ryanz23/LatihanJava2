package matematika;

public class Matematika {
    //int hasil;

    //Method (mutator) Pertambahan
    void setPertambahan(int a, int b){
        System.out.println("Hasil " + a + " + " + b + " = " + (a + b));
    }

    //Method (mutator) Pengurangan
    void setPengurangan(int a, int b){
        //hasil = a - b;
        System.out.println("Hasil " + a + " - " + b + " = " + (a - b));
    }

    //Method (mutator) Perkalian
    void setPerkalian(int a, int b){
        System.out.println("Hasil " + a + " * " + b + " = " + (a * b));
    }

    //Method (mutator) Pembagian
    void setPembagian(int a, int b){
        System.out.println("Hasil " + a + " / " + b + " = " + (a / b));
    }
}
