class Siswa2{
	String nama = "addin";
	String nim = "12345";

	void isiData (String nama, String nim) {
	this.nama=nama;
	this.nim=nim;
	}

	public static void main (String [] args) {

		Siswa2 mahasiswa_stiki = new Siswa2();
		mahasiswa_stiki.isiData ("Aku", "0818999");

		System.out.println("Nama :"+mahasiswa_stiki.nama);
		System.out.println("NIM :"+mahasiswa_stiki.nim); 
	}
}public 