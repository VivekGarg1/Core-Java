package com.collection;

import java.util.EnumSet;

public class EnumSetTest {

	public static void main(String[] args) {
		//Creating EnumSet using range
		EnumSet<WeekDay> weekDaysSet=EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
		for (WeekDay weekDay : weekDaysSet) {
			System.out.println("WeekDay: "+weekDay);
		}
		System.out.println("------------------------");
		
		EnumSet<WeekDay> weekEndSet=EnumSet.complementOf(weekDaysSet);
		for (WeekDay weekEndDay : weekEndSet) {
			System.out.println("WeekDay: "+weekEndDay);
		}
		System.out.println("------------------------");
		System.out.println("Need to work? "+ isWorkingDay(weekDaysSet,WeekDay.MONDAY));
		System.out.println("Need to work? "+ isWorkingDay(weekDaysSet,WeekDay.SATURDAY));
		System.out.println("Need to work? "+ isWorkingDay(weekDaysSet,WeekDay.SUNDAY));
	}

	private static Boolean isWorkingDay(EnumSet<WeekDay> weekDaysSet, WeekDay day) {
		for (WeekDay weekDay : weekDaysSet) {
			if (weekDay.equals(day)) {
				return true;
			}
		}
		return false;
	}

}
