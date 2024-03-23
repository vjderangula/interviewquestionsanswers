package com.interviewquestionsanswers.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapByIntegerValues {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();	
		
		map.put("Kumar", 26);
		map.put("Sampath", 20);
		map.put("Zoya", 25);
		map.put("Darma", 29);		
		System.out.println("Sort the Values In Ascending Order :: ");
		// Sort map based on Value Ascending order
		Map<String, Integer> sortedMapValue = map.entrySet().stream()
				.sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o,n)-> o, LinkedHashMap::new));
		
		sortedMapValue.forEach((key, value) -> System.out.println(key + " : "+value));
		
		System.out.println("Sort the Values In Descending Order :: ");
		// Sort map based on Value descending order
		Map<String, Integer> sortedMapValue1 = map.entrySet().stream()
				.sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o,n)-> o, LinkedHashMap::new));
		
		sortedMapValue1.forEach((key, value) -> System.out.println(key + " : "+value));
		
		
		System.out.println("Sort the Keys In Ascending Order :: ");
		// Sort map based on Key Ascending order
				Map<String, Integer> sortedMapKey = map.entrySet().stream()
						.sorted((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o,n)-> o, LinkedHashMap::new));
				
				sortedMapKey.forEach((key, value) -> System.out.println(key + " : "+value));
		
				System.out.println("Sort the Keys In Descending Order :: ");
		// Sort map based on Key descending order
				Map<String, Integer> sortedMapKey1 = map.entrySet().stream()
						.sorted((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o,n)-> o, LinkedHashMap::new));
				
				sortedMapKey1.forEach((key, value) -> System.out.println(key + " : "+value));
					
		
	}

}
/*


Sort the Values In Ascending Order :: 
Sampath : 20
Zoya : 25
Kumar : 26
Darma : 29
Sort the Values In Descending Order :: 
Darma : 29
Kumar : 26
Zoya : 25
Sampath : 20
Sort the Keys In Ascending Order :: 
Darma : 29
Kumar : 26
Sampath : 20
Zoya : 25
Sort the Keys In Descending Order :: 
Zoya : 25
Sampath : 20
Kumar : 26
Darma : 29
*/