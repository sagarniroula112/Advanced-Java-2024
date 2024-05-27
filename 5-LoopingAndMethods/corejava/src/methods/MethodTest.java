package method;

public class MethodTest {
	public static void main(String[] args) {  // static vako le garda aru non-static laii directly call garna milena
//		sum();
//		printTable(3);
		int returnedVal = getSumOf100();
		System.out.println("Returned from method: " + returnedVal);
		int smallestVal = findSmallest(5, 9);
		System.out.println("Smallest between two: " + smallestVal);
	}
	
	// 1. no return type with no arguments
	static void sum() {    // (static vayena vane) instance method -- object through call garne
			int x = 5;
			int y = 6;
			
			int s = x + y;
			System.out.println("Sum: " + s);
		}
	
	// 2. no return type with arguments
	static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}
	
	// 3. return type with no arguments
	static int getSumOf100() {
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	// 4. return type with arguments
	static int findSmallest(int x, int y) {
		if(x>y) {
			return y;
		}
		else {
			return x;
		}
	}
}
