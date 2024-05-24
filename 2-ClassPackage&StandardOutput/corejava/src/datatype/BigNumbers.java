package datatype;

import java.math.BigInteger;

public class BigNumbers {
	
	/*
	 * a> BigInteger
	 * b> BigDecimal
	 */
	
	public static void main(String[] args) {
		
		BigInteger a = BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
		
//		BigInteger c = a + b;   Arithmetic operators can't be used!
		
		BigInteger c = a.add(b);
		
//		BigDecimal ko pani yasari nai garna milxa
		
		System.out.println(c);
	}
}
