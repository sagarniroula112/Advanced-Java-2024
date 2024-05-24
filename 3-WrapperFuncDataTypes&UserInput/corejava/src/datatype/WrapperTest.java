package datatype;

public class WrapperTest {
	/*
	 * ------- Wrapper Class --------
	 * Every primitive data type has respective class is known as wrapper class.
	 * 
	 * Primitive Type Wrapper Class
	 * byte Byte
	 * short Short
	 * int Integer
	 * long Long
	 * float Float
	 * double Double
	 * char Character
	 * boolean Boolean
	 * 
	 * Wrapper Class contains:
	 * 
	 */

	public static void main(String[] args) {
		Integer a = 2;

		System.out.println(a.toBinaryString(a));

		Integer k = 800;
		// a ko lai a. garda kei method aaudaina because it is pure data
		// but k is linked to wrapper class so different methods haru access garna milxa

		// Auto-boxing: Change/convert primitive type to wrapper type

		int p = 64;
		// Integer t = p;
		System.out.println(Integer.toBinaryString(p));
		// t. This works now!

		// Auto-unboxing: Change/convert wrapper type to primitive type
		// float g = 1.2225f;
		// long teroNumber = 7888888888L;
		Float x = 1.255f;
		float z = x;

		System.out.println(Integer.toBinaryString(3000));
	}
}
