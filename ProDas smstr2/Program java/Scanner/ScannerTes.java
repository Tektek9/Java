import java.util.Scanner;
/**
 *
 * @author AmoebaScript
 */
public class ScannerTes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //"in" adalah nama Variabel, bebas bisa diisi apa saja
        
        String nama, jurusan;
        int nilai;
        
        System.out.println("\nMasukkan nama anda: ");
        nama = in.nextLine();
        //"nextLine" yaitu sebuah perintah intuk mengambil inputan dari Keyboard
        //"nama" yaitu variabel untuk menyimpan hasil inputan dari "nextLine"

        System.out.println ("\nMasukkan jurusan anda: ");
        jurusan = in.nextLine();
        
        System.out.println("\nMasukkan nilai anda: ");
        nilai = in.nextInt();
        //"nextInt" yaitu perintah untuk mengambil inputan berupa Interger dari Keyboard
 
        System.out.println("\n\n\n\n");
        System.out.println("Nama anda adalah "+nama);
        System.out.println("Jurusan anda adalah "+jurusan);
        System.out.println("Nilai anda adalah "+nilai);
        
    }
    
}
