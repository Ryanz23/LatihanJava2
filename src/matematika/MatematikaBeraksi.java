package matematika;

public class MatematikaBeraksi {
    public static void main(String[]args){
        Matematika matematika = new Matematika();

        //setPertambahan
        matematika.setPertambahan(2,3);
        System.out.println("Hasil 2 + 3 = " + matematika.getPertambahan());

        //setPengurangan
        matematika.setPengurangan(3,2);
        System.out.println("Hasil 3 - 2 = " + matematika.getPengurangan());

        //setPerkalian
        matematika.setPerkalian(4,5);
        System.out.println("Hasil 4 * 5 = " + matematika.getPengurangan());

        //setPembagian
        matematika.setPembagian(8,4);
        System.out.println("hasil 8 / 4 = " + matematika.getPembagian());
    }
}
