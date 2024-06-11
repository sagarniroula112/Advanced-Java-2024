package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		// subject - marks
		
//		Map<String, Integer> map = new HashMap<>();
//		Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Math", 90);
		map.put("Nepali", 88);
		map.put("English", 95);
		map.put("Social", 69);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(String key: map.keySet()) {
			System.out.println(key + " = " + map.get(key));
		}
		
		Map<String, List<Integer> > mapList = new HashMap<>();
		
		mapList.put("Science", List.of(80, 70, 69));
		mapList.put("Math", List.of(90, 55, 44));
		mapList.put("Social", List.of(42, 88, 87));	
		
		for(String key: mapList.keySet()) {
//			int sum = 0;
//			for(int x: mapList.get(key)) {
//				sum = sum + x;
//			}
			int sum = mapList.get(key).stream().mapToInt(Integer::intValue).sum();
			
			System.out.println(key + " = " + mapList.get(key) + " Total = " + sum);
		}
		
		/*
		 * Set of student
		 * Set of cow
		 * Set of pen
		 */
	}
}
