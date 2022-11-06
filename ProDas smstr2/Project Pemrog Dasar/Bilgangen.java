import java.io.*;

public class Bilgangen{
	public static void main(String[] args) {
		//instansi objek bernama 'br'
		//yang berapa data BufferedReader
		BufferedReader br = new
		BufferedReader (new InputStreamReader(System.in));

		int bilangan = 0;
		//ganjil atau genap
		//bilangan prima
		//kabisat

		System.out.println("Silahkan isi bilangan:");
		try {

			bilangan = Integer.parseInt(br.readLine());
			if(bilangan % 2  == 0){

				System.out.println(bilangan+" termasuk genap");
			} else {
				System.out.println(bilangan+" termasuk ganjil");
			}

			if((bilangan % 400 == 0)&&(bilangan % 4 == 0)){
				System.out.println(bilangan+" termasuk kabisat");
			} else {
				System.out.println(bilangan+" bukan kabisat");
			}

			 for (int I=bilangan; I<=bilangan;I++)
        	{
            int b = 0;
            for(int h=1; h<=I ;h++){
                if(I%h==0)
                    b=b+1; 
            }
                if(b==2)
                    System.out.println(I+" Bilangan Prima ");
                else
                    System.out.println(I+" Bukan Bilangan Prima ");
        	}

			}
			catch(IOException e) {
			System.out.println("error");
		}
		

	}
}