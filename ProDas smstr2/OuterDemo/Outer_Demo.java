//Outer_Demo.java
class Outer{
	// private variable of the outer class
	private int num = 175;
	//inner class
	public class Inner_Demo {
	public int getNum() {
	System.out.println ("This is the getnum method of the inner class");
	return num;
	}
	}
}

public class Outer_Demo {
	public static void main (String args[])
	{
	Outer outer = new Outer();


	Outer.Inner_Demo inner = outer.new Inner_Demo();
	System.out.println (inner.getNum());

	}
}