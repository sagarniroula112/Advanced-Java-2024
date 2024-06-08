package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		// static or early binding of object
		NabilBank nb = new NabilBank();
		
		nb.getBankName();
		nb.getInterestRate();
		
		// Up casting
		CentralBank b = new PrabhuBank();
		Test t = new Test();
		
		t.printBank(b);
		
	}
	
	// dynamic or late binding of object or run-time poly-morphism
	void printBank(CentralBank b) {
		b.getBankName();
		b.getInterestRate();
	}
}

// Employee - Car --> Aggregation (has a)
// Building - Room --> Composition (part of) [Inner class (Nested class) ???????]

