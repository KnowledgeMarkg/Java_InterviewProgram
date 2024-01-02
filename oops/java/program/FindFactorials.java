package oops.java.program;

class Factorials{
	int num ;
	public Factorials() {
		// TODO Auto-generated constructor stub
		num = 6;
	}
	
	void findFact() {
		int n = num;
		for(int i=1; i<n; i++) {
			num=num*i;
		}
		System.out.println(num);
	}
} 

public class FindFactorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Factorials fact = new Factorials();
        fact.findFact();
	}

}
