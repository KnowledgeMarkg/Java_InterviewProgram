package oops.java.program;


class Robot{
	public void walk() {
		System.out.println("Walking");
	}
	
	public void talk() {
		System.out.println("Talking");
	}
	
	public void charge() {
		System.out.println("Charge ");
	}
	
}

class ChefRobot extends Robot{
	public void cook() {
		System.out.println("Robot is cooking");
	}
}

class DoctorRobot extends Robot{
	public void sergury() {
		System.out.println("Doctor is Doing Surgery");
	}
}

class TeacherRobot extends Robot{
	  public void teach() {
		  System.out.println("Teacher is teaching");
	  }
}
public class InheritanceExample {

	public static void main(String[] args) {
		ChefRobot chefRB = new ChefRobot();
		DoctorRobot doctorRB = new DoctorRobot();
		TeacherRobot teacherRB = new TeacherRobot();
		
		chefRB.charge();
		chefRB.walk();
	}

}
