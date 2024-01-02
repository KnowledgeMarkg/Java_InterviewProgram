package oops.java.program;

class Area{
	int a, b, c;
	double areaCal, r;
	
	void area(int x ) {
		a= x;
		areaCal = (float) Math.pow(a, 2);
		System.out.println("Area Of Square Is : " +areaCal);
	}
	
	void area (int x , int y) {
		a= x;
		b=y;
		areaCal = a*b;
		System.out.println("Area Of Rectangle Is : " +areaCal);
	}
	
	void area(double x) {
		r=x;
		areaCal = (float) (Math.PI*Math.pow(r, 2));
		System.out.println("Area Of Circle Is : "+areaCal);
	}
	void area (int x , int y, int z) {
		a=x ; b=y; c= z;
		float s = (a+b+c)/2;
		areaCal = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area Of Triangle is : "+areaCal);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Area ar = new Area();
		ar.area(5);
		ar.area(3, 4);
		ar.area(3.4);
		ar.area(10, 20, 14);
	}

}
