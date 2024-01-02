package oops.java.program;

class LearnStatic{
	static int a;
	static int b;
	static {
		a =10;
		b =20;
		System.out.println("In Static Block");
	}
	static void display1() {
		System.out.println("I am in Static Method ");
		System.out.println(a+","+b);
	}
	int x, y;
	LearnStatic(int x , int y){
		this.x = x;
		this.y = y;
		System.out.println("In LearnStatic Class Constructor");
	}
	
	{
		System.out.println("In a non- Static Block");
	}
	void dispaly2() {
		System.out.println("in a Non Static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}
public class LearnStaticKeyword {

	public static void main(String[] args) {
		LearnStatic.display1();
		LearnStatic lS = new LearnStatic(10, 20);
		lS.dispaly2();
	}
}
