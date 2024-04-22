package sepeda;

public class Sepeda {
    int gir;

    //Method (mutator) with parameter
    void setGir(int pertambahanGir){
        gir = gir + pertambahanGir;
    }

    //Method (accessor)
    int getGir(){
        return gir;
    }
}
