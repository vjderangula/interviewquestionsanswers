package com.interviewquestionsanswers.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NoOfOccurancesAlphabeticalStrings {

	public static void main(String[] args) {

		List<String> elements= new ArrayList<>();
        elements.add("Oranges");
        elements.add("Figs");
        elements.add("Mangoes");
        elements.add("Apple");

List<String> listofComments = new ArrayList<>();
        listofComments.add("Apples are better than Oranges");
        listofComments.add("I love Mangoes and Oranges");
        listofComments.add("I don't know like Figs. Mangoes are my favorites");
        listofComments.add("I love Mangoes and Apples");
		
        Map<String,Predicate<String>> filters = elements.stream()
        	 .sorted(String.CASE_INSENSITIVE_ORDER)
        	 .map(s -> Pattern.compile(s, Pattern.LITERAL|Pattern.CASE_INSENSITIVE))
        	 .collect(Collectors.toMap(Pattern::pattern, Pattern::asPredicate,
        	    (a,b) -> { throw new AssertionError("duplicates"); }, LinkedHashMap::new));
		        
        filters.entrySet().stream()
        .map(e -> Map.entry(e.getKey(), listofComments.stream().filter(e.getValue()).count()))
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(e -> System.out.printf("%-7s%3d%n", e.getKey(), e.getValue()));
	
	System.out.println("====================");
	
	Function<String, Map.Entry<String, Long>> function = f -> Map.entry(f, listofComments.stream()
	        .filter(e -> e.toLowerCase().contains(f.toLowerCase())).count());
	elements.stream().map(function)
    .sorted(Comparator.comparing(Map.Entry<String, Long>::getValue)
    .reversed().thenComparing(Map.Entry::getKey))
    .forEach(System.out::println);
	
	}}
