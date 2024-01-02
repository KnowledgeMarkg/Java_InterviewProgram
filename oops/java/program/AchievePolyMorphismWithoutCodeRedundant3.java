package oops.java.program;

class Shape4 {
	void drawShape1() {
		System.err.println("Draw The Shape Inside The Shape Class");
	}

	double findArea() {
		return 0.0;
	}
}

class Circle4 extends Shape4 {
	double rad = 4.5;

	double findArea() {
		return 3.14 * Math.copySign(rad, 2);
	}

	double findPerimeter() {
		return 2 * 3.14 * rad;
	}
}

class Square extends Shape4 {
	double length = 4.5;

	double findArea() {
		return length * length;
	}

	double squarePerimeter() {
		return length + length;
	}
}

class Rectangle4 extends Shape4 {
	double l = 4.5;
	double w = 5.6;

	double findArea() {
		return l * w;
	}

	double rectanglePeri() {
		return l + w;
	}
}

class AllShape4 {
	void calArea(Shape4 sh) {
		System.out.println(sh.findArea());
		sh.drawShape1();
		if(sh instanceof Rectangle4) {
		System.out.println(((Rectangle4) (sh)).rectanglePeri()); // Down casting
		}else if(sh instanceof Circle4) {
		System.out.println(((Circle4) (sh)).findPerimeter()); // Down casting
		}else {
		System.out.println(((Square) (sh)).squarePerimeter()); // Down casting
		}
	}
}

public class AchievePolyMorphismWithoutCodeRedundant3 {

	public static void main(String[] args) {
		Shape4 sh;
		
		AllShape4 allShape4 = new AllShape4();
		Rectangle4 rec = new Rectangle4();
		Circle4 c = new Circle4();
		Square sq = new Square();
		
		sh = rec; // up Casting
		sh = c; // up casting
		sh = sq; // Up Casting
		
		allShape4.calArea(rec);
		System.out.println("-------------------------");
		allShape4.calArea(c);
		System.out.println("-------------------------");
		allShape4.calArea(sq);
		
	}

}
