package oops.java.program;

class Number{
	int a ;
	public Number(int x ) {
		// TODO Auto-generated constructor stub
		a=x;
		System.out.println("This Is Number Class Constructor "+a);
	}
}

class Value extends Number{
  int b;
	public Value(int x) {
		super(20);
		b =x;
		System.out.println("This Is Class value "+b);
	}
	void showData() {
		System.out.println("Value Of a " +a);
		System.out.println("Value Of b " +b);
	}
}


public class Superkeyword {

	public static void main(String[] args) {
	 	Value v = new Value(70);
	 	v.showData();
	}

}
