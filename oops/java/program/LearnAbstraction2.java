package oops.java.program;

abstract class Car {
	void start() {
		System.out.println("Car Is Starting");
	}
	void stop() {
		System.out.println("Car is Stoping by Button");
	}
	abstract void refuel();
}
class ElectricCar extends Car{
	@Override
	void refuel() {
		System.out.println("Electric Car Require Electric To Running");
	}
}
class PetrolCar extends Car{
	@Override
	void refuel() {
		System.out.println("Electric Car Require Petrol To Running");
	}
}

class DiselCar extends Car{

	@Override
	void refuel() {
		System.out.println("Disel Car requre Disel For Running");
	}
}
class DoAllWork{
	void doWork(Car c) {
		c.start();
		c.stop();
		c.refuel();
		System.err.println("===================");
	}
}
public class LearnAbstraction2 {

	public static void main(String[] args) {
	   PetrolCar pr = new PetrolCar();
	   DiselCar dr = new DiselCar();
	   ElectricCar er = new ElectricCar();
	   DoAllWork work = new DoAllWork();
	   work.doWork(er);
	   work.doWork(dr);
	   work.doWork(pr);
	}

}
