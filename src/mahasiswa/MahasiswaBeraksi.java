package mahasiswa;

public class MahasiswaBeraksi {
    public static void main(){
        //Create object
        Mahasiswa mahasiswa = new Mahasiswa();

        //Add attribute and value
        mahasiswa.mengamati = "Mengamati Pelajaran";
        mahasiswa.meniru = "Meniru Teman";
        mahasiswa.modifikasi = "Modifikasi";

        //Call Method
        mahasiswa.printMahasiswa();

    }
}
