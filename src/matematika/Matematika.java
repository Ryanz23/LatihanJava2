package matematika;

public class Matematika {
    int hasil;

    //Method (mutator) Pertambahan
    void setPertambahan(int a, int b){
        hasil = a + b;
    }
    //Method (accessor)
    int getPertambahan(){
        return hasil;
    }

    //Method (mutator) Pengurangan
    void setPengurangan(int a, int b){
        hasil = a - b;
    }
    //Method (accessor)
    int getPengurangan(){
        return  hasil;
    }

    //Method (mutator) Perkalian
    void setPerkalian(int a, int b){
        hasil = a * b;
    }
    //Method (accessor)
    int getPerkalian(){
        return hasil;
    }

    //Method (mutator) Pembagian
    void setPembagian(int a, int b){
        hasil = a / b;
    }
    //Method (accessor)
    int getPembagian(){
        return hasil;
    }
}
