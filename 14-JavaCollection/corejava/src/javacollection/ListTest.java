package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import oops.Student;

public class ListTest {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		List<String> list = new LinkedList<>();
		List<String> list = new LinkedList<>();
		
		list.add("Japan");
		list.add("Nepal");
		list.add("Korea");
		list.add("Dubai");
		
		list.remove(2);
		list.remove("Dubai");
		System.out.println(list.contains("Japan"));
//		list.clear();
		
		for(String s:list) {
			System.out.println(s);
		}
		
//		List<Student> list = new ArrayList<>();
//		Student s = new Student();
//		
//		list.add(s);
		
		/*
		 * List of Employee
		 * List of Dog
		 * List of Book
		 */
	}
}
