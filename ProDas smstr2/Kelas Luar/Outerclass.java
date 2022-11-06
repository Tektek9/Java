public class Outerclass2 {
	void my_Method()
	{
	int num = 23;
	//method-local inner class
	class MethodInner_Demo {
	public void print() {
	System.out.println ("This is method inner class "+num);

	}
	} //end of inner class
	} 
	// Accessing the inner class 
	MethodInner_Demo inner = new MethodInner_Demo();
	inner.print();

public static void main (String args[]) {
	Outerclass2 outer = new Outerclass2();
	outer.my_method();
}
}