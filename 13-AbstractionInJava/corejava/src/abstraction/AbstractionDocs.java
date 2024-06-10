package abstraction;

public class AbstractionDocs {
	/*
	 * ----------- Abstraction -------------
	 * 
	 * # Process of hiding implementation details in the program is known as abstraction
	 * # To achieve abstraction:
	 * 
	 * 		a> Abstract class:
	 * 			# Class which contains abstract(un-implemented) methods and non-abstract methods
	 * 			
	 * 				# abstract method: (by force, child class ma implement garauna paro vane)
	 * 					-> method which does not have body/implementation
	 * 
	 * 					# syntax:
	 * 						abstract return_type method_name();
	 * 
	 * 						e.g.:
	 * 						abstract void print();
	 * 						abstract int getValue(int x, int y);
	 * # Every abstract class must have at least one child class and child class must override abstract methods. (v.v.imp!)
	 * # We can't create object of abstract class.
	 * # Level of abstraction : 0-100%
	 * 
	 * 	# syntax:
	 * 		abstract class class_name{
	 * 			// abstract methods
	 * 
	 * 			// non-abstract methods
	 * 		}
	 * 
	 * 		b> Interface:
	 * 			# Looks like a class which contains public abstract methods and public static final(constant) variables
	 * 			
	 * 			# By default abstract hunxa
	 * 
	 * 			# Every interface must have at least one implementation class and impl. class must override abstract methods.
	 * 
	 * 			# We can't create objects of interface.
	 * 			# Level of abstraction: 100%
	 * 
	 * 			# syntax:
	 * 				interface interface_name{
	 * 					// public abstract methods
	 * 				}
	 */
}
