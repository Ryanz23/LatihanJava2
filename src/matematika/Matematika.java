package matematika;

public class Matematika {
    int hasil;

    //Method (mutator) Pertambahan
    void setPertambahan(int a, int b){
        hasil = a + b;
    }

    //Method (mutator) Pengurangan
    void setPengurangan(int a, int b){
        hasil = a - b;
    }

    //Method (mutator) Perkalian
    void setPerkalian(int a, int b){
        hasil = a * b;
    }

    //Method (mutator) Pembagian
    void setPembagian(int a, int b){
        hasil = a / b;
    }

    //Method (accessor) Pertambahan
    int getPertambahan(){
        return hasil;
    }

    //Method (accessor) Pengurangan
    int getPengurangan(){
        return hasil;
    }

    //Method (accessor) Perkalian
    int getPerkalian(){
        return hasil;
    }

    //Method (accessor) Pembagian
    int getPembagian(){
        return hasil;
    }
}
