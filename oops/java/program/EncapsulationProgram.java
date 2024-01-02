package oops.java.program;

class Encapsulation {
	private int rollNo;
	private String name;
	private int pass;

	public Encapsulation(int rollNo, String name, int pass) {
		this.rollNo = rollNo;
		this.name = name;
		this.pass = pass;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getPass() {
		return pass;
	}

}

public class EncapsulationProgram {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation(1, "kausar Raza", 22646);
        System.out.println(e.getRollNo());
        System.out.println(e.getName());
        System.out.println(e.getPass());
	}

}
