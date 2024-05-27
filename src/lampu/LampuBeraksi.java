package lampu;

public class LampuBeraksi {
    public static void main(String[]args){
        Lampu lampuKamar = new Lampu();

        System.out.println("Status Lampu Saat Ini: Mati");

        lampuKamar.hidupkan();//hidupkan lampu
        lampuKamar.matikan();//matikan lampu
        lampuKamar.matikan();//matikan lampu
        lampuKamar.hidupkan();//hidupkan lampu
        lampuKamar.hidupkan();//hidupkan lampu
    }
}
