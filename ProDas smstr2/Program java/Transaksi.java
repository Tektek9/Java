package dodolan;

public class Transaksi extends Costumer implements Barang{
 
    private int kdTrans, banyak,kodeBrg;
    private String namaBrg;
    private float harga;
 
    public Transaksi(int No_id, String Nama, String Alamat) {
        super(No_id, Nama, Alamat);
    }
 
    public void setTransaksi(int kdTrans,int banyak) {
        this.kdTrans = kdTrans;
        this.banyak=banyak;
 
    }
 
    
 
   public void setBarang(int kodeBrg, String namaBrg, float harga) {
        this.kodeBrg=kodeBrg;
        this.namaBrg=namaBrg;
        this.harga=harga;
    }
 
    
 
}