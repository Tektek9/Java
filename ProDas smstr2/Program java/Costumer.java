
package dodolan;

public class Costumer {
    private int noID;
    private String Nama,Alamat;
 
    public Costumer(int No_id, String Nama, String Alamat) {
        this.noID = No_id;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
 
    public String getAlamat() {
        return Alamat;
    }
 
    public String getNama() {
        return Nama;
    }
 
    public int getNo_id() {
        return noID;
    }
 
}