package ac;

public class AC implements InterfaceAC{
    private boolean isOn;
    private int suhu;

    public AC(){
        isOn = false;
        suhu = 25; //suhu ruangan
    }

    public void matikanAC() {
        isOn = false;
        System.out.println("AC Mati");
    }

    public void hidupkanAC() {
        isOn = true;
        System.out.println("AC Hidup");
    }

    public void dinginkanAC() {
        if (isOn){
            suhu -= 5;
            System.out.println("AC Dingin, Suhu Saat Ini: " + suhu);
        }else{
            System.out.println("AC Tidak Dapat Mendinginkan atau Menghangatkan Saat Dimatikan!");
        }
    }
    
    public void panaskanAC() {
        if (isOn){
            suhu += 5;
            System.out.println("AC Panas, Suhu Saat Ini: " + suhu);
        }else{
            System.out.println("AC Tidak Dapat Mendinginkan atau Menghangatkan Saat Dimatikan!");
        }
    }
}
