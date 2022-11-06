import java.io.*;

public class InputBR{
	public static void main(String[] args) {
		//instansi objek bernama 'br'
		//yang berapa data BufferedReader
		BufferedReader br = new
		BufferedReader (new InputStreamReader(System.in));

		String nama = "";
		String alamat = "";
		int usia = 0;
		double nilai = 0;
		System.out.println("Silahkan isi nama:");
	
		try{
			nama = br.readLine();

			System.out.println("Silahkan isi alamat:");
			alamat = br.readLine();

			System.out.println("Silahkan isi usia:");
			usia = Integer.parseInt(br.readLine() );

			System.out.println("Silahkan isi nilai:");
			nilai = Double.parseDouble(br.readLine() );
		}catch(IOException e) {
			System.out.println("error");
		}
		System.out.println("hallo nama kamu "+nama);
		System.out.println("hallo alamat kamu "+alamat);
		System.out.println("hallo usia kamu "+usia);
		System.out.println("hallo nilai kamu "+nilai);	

	}
}