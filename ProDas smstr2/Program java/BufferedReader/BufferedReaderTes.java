import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderTes {
	public static void main (String[] args){
	
	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	//"datain" adalah sebuah variabel yan bisa diisi sembarang, berfungsi untuk menyimpan nilai inputan dari Keyboard
	
	String name = "";
	//"name" sebagai variabel untuk mendeklarasikan inputan dari readLine
	System.out.println("\nPlease enter your name: \n");
	try{
		name = dataIn.readLine();}
		//"readLine" adalah perintah untuk mendapatkan perintah inputan dari keyboard

		catch(IOException e){System.out.println("\nError!");}
		System.out.println("\n==================================\n= Hello "+name +"! =\n==================================");
	}
}
