package oops.java.program;
//WAP in java to create a class laptop having the data
//member as processor name and memory size achieve Encapsulation 
//for laptop class for both the data member by using constructor and create 
//two objects of laptop class that also display the values of data member. 

class Laptop{
	private String processorName;
	private int memorySized;
	
	public Laptop(String processorName, int memorySized ) {
		this.processorName = processorName;
		this.memorySized = memorySized;
	}
	
	public String getProcessName() {
		return processorName;
	}
	
	public int getMemorySize() {
		return memorySized;
	}
}
public class LaptopClassEncapsulation {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("I5", 8);
		Laptop l2 = new Laptop("I7", 12);
		System.out.println(l1.getProcessName());
		System.out.println(l1.getMemorySize());
		System.out.println("Second Laptopn");
		
		System.out.println(l2.getProcessName());
		System.out.println(l2.getMemorySize());
	}

}
