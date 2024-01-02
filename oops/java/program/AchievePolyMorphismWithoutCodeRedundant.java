package oops.java.program;

class Shape1{
	void ShapeDraw() {
		System.out.println("Shape Draw By the help of Shape Draw Method");
	}
	
	double findArea() {
		return 0.0;
	}
}

class Circle1 extends Shape1{
	void ShapeDraw() {
		System.out.println("Draw A circle Shape");
	}
	
	double findArea() {
		return 3.14*5.5*5.5;
	}
}

class Rectangle extends Shape1{
	void ShapeDraw() {
		System.out.println("Draw Rectangle Shape");
	}
	double findArea() {
		return 5.4*5.5;
	}
}

class Geometry{

	public void activity(Shape1 sh) {
		sh.ShapeDraw();
		System.out.println(sh.findArea());
	}
	
}
public class AchievePolyMorphismWithoutCodeRedundant {

	public static void main(String[] args) {
		Circle1 c = new Circle1();
		Rectangle rt  = new Rectangle();
		Geometry gr = new Geometry();
		gr.activity(c);
		gr.activity(rt);
	}

}
