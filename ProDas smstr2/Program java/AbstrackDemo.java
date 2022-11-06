//filename: AbstrackDemo.java
public class AbstractDemo {
	public static void (String[] args)	{
Gaji g = new Gaji("Mohd Mohthasim", "Ambheta, Up", 3,3600.00);
Gaji k = new Gaji("Jhon Adams", "Boston, MA", 2,2400.00);
System.out.println("Memanggil mailCheck mereferensi Gaji --");
g.mailCheck();
System.out.println("\n Memanggil mailCheck mereferensi Karyawan");
k.mailCheck();
}
}

	//kode berikut akan menyebabkan error 
//	Karyawan k = new Karyawan("Taukhid", "Adit", "Robby", 41);

//	System.out.println ("\n Memanggil mailcheck menggunakan refrensi Karyawan --"); k.mailCheck();
//	}
//}
