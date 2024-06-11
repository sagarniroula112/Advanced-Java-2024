package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>(); // unique + sorted
//		Set<String> set = new LinkedHashSet<>();
		
		set.add("everest");
		set.add("kanchanjunga");
		set.add("dhaulagiri");
		set.add("annapurna");
		set.add("everest");
		
		for(String s:set) {
			System.out.println(s);
		}
	}
}
