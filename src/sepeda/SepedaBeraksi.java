package sepeda;

public class SepedaBeraksi {
    public static void main(String[]args){
        Sepeda sepedaku = new Sepeda();

        //set gir value = 1
        sepedaku.setGir(1);
        System.out.println("Gir saat ini : " + sepedaku.getGir());

        //adds 3 to the current gear position (1)
        sepedaku.gir=3;
        System.out.println("Gir saat ini : " + sepedaku.getGir());
    }
}
