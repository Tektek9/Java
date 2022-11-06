import java.io.*;

public class Nilaiakhir{
	public static void main(String[] args) {
		//instansi objek bernama 'br'
		//yang berapa data BufferedReader
		BufferedReader br = new
		BufferedReader (new InputStreamReader(System.in));

		String nama = "";
		int tugas = 0;
		int uts = 0;
		int uas = 0;
		double nilai = 0;

		System.out.println("Silahkan isi nama:");
	
		try{
			nama = br.readLine();

			System.out.println("Silahkan isi nilai tugas anda:");
			tugas = Integer.parseInt(br.readLine() );
			
			System.out.println("Silahkan isi nilai uts anda:");
			uts = Integer.parseInt(br.readLine() );


			System.out.println("Silahkan isi uas:");
			uas = Integer.parseInt(br.readLine() );

			nilai = ( 0.5 * uas)+(0.2*tugas)+(0.3*uts);
		}catch(IOException e) {
			System.out.println("error");
		}
		
		System.out.println("hallo nama kamu "+nama);
		System.out.println("Nilai Akhir kamu "+nilai);	

	}
}