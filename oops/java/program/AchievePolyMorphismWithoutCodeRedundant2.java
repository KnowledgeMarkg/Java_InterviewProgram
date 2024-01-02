package oops.java.program;

class Developer{
	void attendMeeting() {
		System.out.println("Developer Attend The Meeting");
	}
	void project() {
		System.out.println("Developer Work on project");
	}
}

class BackendDeveloper extends Developer{
	void project() {
		System.out.println("Backend Developer Work On Backend Project");
	}
	
	void learnJava() {
		System.out.println("Backend Developer Learn Java And Use Java As Backend");
	}
}

class DataBaseDeveloper extends Developer{
	void project() {
		System.out.println("Database Developer Doing Project On Database");
	}
	void LearnDB() {
		System.out.println("Database Developer Learn DB To Work as DB Developer ");
	}
}

class WebDeveloper extends Developer {
	void project() {
		System.out.println("Web Developer work as a Frontend Developer");
	}
	
	void learnHTML() {
		System.out.println("Web Developer learn HTML to Create WEb Pages");
	}
}

class AllDeveloperWork{
	void activateWork(Developer d) {
		d.attendMeeting();
		d.project();
	}
}
public class AchievePolyMorphismWithoutCodeRedundant2 {

	public static void main(String[] args) {
		AllDeveloperWork allDev = new AllDeveloperWork();
		BackendDeveloper bd = new BackendDeveloper();
		DataBaseDeveloper dbDev = new DataBaseDeveloper();
		WebDeveloper webDev = new WebDeveloper();
		System.out.println("-------------------------------");
		allDev.activateWork(webDev);
		System.out.println("-------------------------------");
		allDev.activateWork(dbDev);
		System.out.println("-------------------------------");
		allDev.activateWork(bd);
		System.out.println("-------------------------------");
		webDev.learnHTML();
		bd.learnJava();
		dbDev.LearnDB();
	}

}
