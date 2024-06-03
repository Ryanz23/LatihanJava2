package matematika;

public class MatematikaCanggih extends Matematika{
    void setModulus(int a, int b){
        hasil = a % b;
    }

    int getModulus(){
        return hasil;
    }
    void setPenjumlahanPecahan(double a2, double b2, double c2) {
        hasil = (int) (a2 + b2+ c2);
    }
    double getPenjumlahanPecahan(){
        return hasil;
    }

}
