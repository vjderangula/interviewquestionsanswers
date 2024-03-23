package com.interviewquestionsanswers.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapByIntegerValuesApproch2 {

	public static void main(String[] args) {

		
Map<String, Integer> map = new HashMap<String, Integer>();	
		
		map.put("Kumar", 26);
		map.put("Sampath", 20);
		map.put("Zoya", 25);
		map.put("Darma", 29);
		
		System.out.println("Before Sorting : ");		
		System.out.println(map);
		
		Map<String, Integer> sortedMap = map.entrySet().stream()
				.sorted((e1, e2)->{return e1.getValue() - e2.getValue();
				}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println("Before Sorting : ");		
		System.out.println(sortedMap);
		
	}

}
