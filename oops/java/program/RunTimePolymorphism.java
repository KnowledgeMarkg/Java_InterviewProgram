package oops.java.program;

class Payment{
	void billGen() {
		System.out.println("Bill Generated");
	}
	void offer() {
		System.err.println("Offer generated");
	}
	
	void pay() {
		System.out.println("Pay Method Of Payment Class");
	}
}

class Upi extends Payment {
	void pay() {
		System.out.println("Pay The Bill By UPI Method");
	}
}

class Wallet extends Payment {
	void pay() {
		System.out.println("Pay The Bill By Using the Wallet");
	}
}

class Card extends Payment {
	void pay() {
		System.out.println("Pay The Bill By Using The Card");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Card crd = new Card();
		System.out.println("Card Method ");
		crd.pay();
		crd.billGen();
		crd.offer();
		Upi upi = new Upi();
		System.out.println("UPI Methods ");
		upi.pay();
		upi.offer();
		upi.billGen();
		Wallet wlt = new Wallet();
		System.out.println("Wallet Method");
		wlt.pay();
		wlt.billGen();
		wlt.offer();
		
	}

}
