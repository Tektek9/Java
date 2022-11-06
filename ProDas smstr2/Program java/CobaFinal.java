public class CobaFinal {
	public final void fungsiku ()
 {
 System.out.println("Tidak bisa dilakukan overidding terhadap method ini");
 }
}

class CobaOver extends CobaFinal {
	public final void fungsiku (){
	System.out.println("Mencoba melakukan overidding terhadap method final");
	}
}N