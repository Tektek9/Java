public class KelasLuar2{
	//class dalam/Inner Class Static
	private static class Programming{
	private String language;
	private void setLanguage(String language) {
	this.language = language;
	}
	private String getLanguage() {
	return language;
	}
	}
	public static void main(String[] args)
	{
		//Membuat Instance dari kelas Dalam (Programming)
		KelasLuar2.Programming MyLanguage = new 
		KelasLuar2.Programming();

		//Memasukan Nilai/Value 
		MyLanguage.setLanguage("Java");

		//Menampilkan Hasil Output
		System.out.println("Saya Sedang Mempelajari :"+MyLanguage.getLanguage());
	}
}