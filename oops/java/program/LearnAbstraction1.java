package oops.java.program;

abstract class Developer2 {
	void attendMeeting() {
		System.out.println("Developer Attend the Meeting");
	}
	abstract void doProject();
}

class PythonDeveloper extends Developer2{
	void learnPython() {
		System.out.println("Python Developer Learn Python");
	}
	@Override
	void doProject() {
		System.out.println("Python Developer Do Python Project");
	}
}

class JavaDevelper extends Developer2{
	void learnJava() {
		System.out.println("java Developer Learn Java");
	}
	@Override
	void doProject() {
		System.out.println("Java Developer Doing java Project");
	}
}

class AllDev{
	void doActivity(Developer2 d) {
		d.attendMeeting();
		d.doProject();
		if(d instanceof JavaDevelper) {
			((JavaDevelper)(d)).learnJava();
		}else if(d instanceof PythonDeveloper) {
			((PythonDeveloper)(d)).learnPython();
		}
		System.err.println("===========================");
	}
}
public class LearnAbstraction1 {

	public static void main(String[] args) {
		JavaDevelper jD = new JavaDevelper();
		PythonDeveloper pD = new PythonDeveloper();
		AllDev aldev = new AllDev();
		aldev.doActivity(pD);
		aldev.doActivity(jD);
	}

}
