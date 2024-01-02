package oops.java.program;
class APSeriesFun {
	int a , d, n, T;
	public APSeriesFun() {
		a = 5; d = 7 ; n=10 ;
	}
	
	void printAPSeries() {
		for(int i=0 ;i< n ; i++) {
			T = a+(i*d);
			System.out.print(T +" ");
		}
	}
	
}
public class APSeries {
public static void main(String[] args) {
	APSeriesFun ap = new APSeriesFun();
	ap.printAPSeries();
}
}
