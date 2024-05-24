package datatype;

public class DataTypeDocs {
	/*
	 * ---- Data Type ------
	 * Proper data representation
	 * Proper memory allocation
	 * Proper operation to be performed e.g. number-calculations
	 * 
	 * Types of datatype
	 * 1. Primitive - byte, short, int(default), long, float(small fraction),
	 * double(large)(default), char, boolean
	 * 2. Non-primitive - string, array, classes, collection
	 * 
	 */
	public static void main(String[] args) {
		long x = 5000000000L; // L at the end for long int
		float k = 1.5555F; // int ra double ma rakhnu parena

		// REM!!!:: Byte, Integer, etc are wrapper classes in java

		System.out.println("Byte(in bits) = " + Byte.SIZE); // 8 bits hunxa yasko
		System.out.println("Val = " + Byte.MIN_VALUE); // -128 hunxa yasko
		System.out.println("Val = " + Byte.MAX_VALUE); // 127 hunxa yasko

		System.out.println("IntSize(in bits) = " + Integer.SIZE);
		System.out.println("Val = " + Integer.MIN_VALUE);
		System.out.println("Val = " + Integer.MAX_VALUE);
	}
}
