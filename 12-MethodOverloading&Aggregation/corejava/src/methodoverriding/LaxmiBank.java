package methodoverriding;

public class LaxmiBank extends CentralBank {
	
	@Override
	void getBankName() {
		System.out.println("Laxmi Bank");
	}
	
	@Override
	void getInterestRate() {
		System.out.println("13%");
	}
	
}
