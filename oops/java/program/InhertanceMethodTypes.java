package oops.java.program;

class Shape {
	void drawShape() {
		System.out.println("This Method Draw The Shape");
	}

	double calculateArea() {
		return 5.0;
	}
}

class Circle extends Shape {
	double radius = 5.5;

	double areaOfCircle() {
		return Math.PI * (Math.pow(radius, 2));
	}

	double perimeterOfCircle() {
		return 2 * Math.PI * radius;
	}

	double parentClassMethod() {
		return super.calculateArea();
	}
}

public class InhertanceMethodTypes {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.drawShape();
		System.out.println(c.areaOfCircle());
		System.out.println(c.perimeterOfCircle());
		System.out.println(c.parentClassMethod());
	}
}
