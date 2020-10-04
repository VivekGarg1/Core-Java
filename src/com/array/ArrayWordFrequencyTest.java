package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayWordFrequencyTest {

	public static void main(String[] args) {
		
		List<String> words= Arrays.asList("Apple","Ananas","Mango","Banana",
				"Beer","Mango","Apple","Mango","Apple","Mango","Ananas");
		Map<String, List<String>> map = words.stream().sorted().collect(Collectors.groupingBy(e->e));
		System.out.println(map);
	}

}
