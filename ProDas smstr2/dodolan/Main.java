
 
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            
            System.out.println("Aplikasi Transaksi"  );
            System.out.print("Nama Customer: ");
            String nama = reader.readLine();
            System.out.print("Alamat Customer: ");
            String alamat = reader.readLine();

            System.out.print("Kode Barang: ");
            int kodeBarang  = Integer.parseInt(reader.readLine());
            System.out.print("Nama Barang: ");
            String namaBarang = reader.readLine();
            System.out.print("Harga Barang: Rp");
            float hargaBarang = Float.parseFloat(reader.readLine());
            System.out.print("Jumlah Barang: ");
            int jumlah  = Integer.parseInt(reader.readLine());

            Transaksi trans = new Transaksi(
               nama, alamat, kodeBarang, namaBarang, hargaBarang, jumlah 
            );

            System.out.println("== DATA TRANSAKSI ==");
            System.out.println("Nama Customer: " + trans.nama);
            System.out.println("Alamat Customer: " + trans.alamat);
            System.out.println("Kode Barang: " + trans.getIdBarang());
            System.out.println("Nama Barang: " + trans.getNamaBarang());
            System.out.println("Harga Barang: Rp" + trans.getHargaBarang());
            System.out.println("Jumlah Barang: " + trans.jumlah);
            System.out.println("TOTAL : Rp" + trans.getTotalTransaksi());
        
        
        }catch(Exception e){
            System.out.println("Error:");
            e.printStackTrace();
        }
    }
}