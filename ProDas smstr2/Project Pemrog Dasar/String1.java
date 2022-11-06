public class String1{
	public static void main (String[] args) {

	String strA = "Saya Programmer";
	String strB = "Saya suka pemrograman\n";

	System.out.println("strA = "+strA);
	System.out.println("strB = "+strB);

	//Mengubah isi String menjadi huruf besar

	String besarA = strA.toUpperCase();
	String besarB = strB.toUpperCase();

	System.out.println ("Mengubah isi String huruf besar");
	System.out.println ("strA = "+besarA);
	System.out.println ("strB = "+besarB+"\n");

	//Mengubah isi string menjadi huruf kecil toLowercase()
	String kecilA = strA.toLowerCase();
	String kecilB = strB.toLowerCase();

	System.out.println ("Mengubah isi String huruf kecil");
	System.out.println("strA = "+kecilA);
	System.out.println("strB = "+kecilB+"\n");



	}
}