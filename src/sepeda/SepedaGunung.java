package sepeda;

public class SepedaGunung extends Sepeda{
    private int sadel;

    void setGir(int pertambahaGir){
        super.setGir(pertambahaGir);
        gir = 2*getGir();
    }
    void setSadel(int jumlah){
        sadel = getGir() - jumlah;
    }

    int getSadel(){
        return sadel;
    }
}
