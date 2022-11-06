public class Outer_Demo2 {
	public static void main (String args[])
	{
	Outer outer = new Outer();


	Outer.Inner_Demo inner = outer.new Inner_Demo();
	System.out.println (inner.getNum());

	}
}