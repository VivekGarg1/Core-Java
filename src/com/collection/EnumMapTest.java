package com.collection;

import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Set;

public class EnumMapTest {

	public static void main(String[] args) {
		EnumMap<Numbers , String> enumMap=new EnumMap<Numbers,String>(Numbers.class);
		enumMap.put(Numbers.ONE, "1");
		enumMap.put(Numbers.TWO, "2");
		enumMap.put(Numbers.THREE, "3");
		enumMap.put(Numbers.FOUR, "4");
		enumMap.put(Numbers.FIVE, "5");
		enumMap.put(Numbers.SIX, "6");
		
		Set<Entry<Numbers, String>> entrySet = enumMap.entrySet();
		for (Entry<Numbers, String> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}

}
