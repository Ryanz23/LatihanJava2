package sepeda;

public class SepedaGunungBeraksi {
    public static void main (String[] args){
        SepedaGunung sg = new SepedaGunung();

        sg.setGir(2);
        System.out.println(sg.getGir());

        sg.setGir(3);
        System.out.println(sg.getGir());

        /*sg.setSadel(1);
        System.out.println(sg.getSadel());*/
    }
}
