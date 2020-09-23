package com.home.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalScalingAndRounding {

	public static void main(String[] args) {
		BigDecimal bd1=new BigDecimal(23.12);
		System.out.println(bd1.toString());
		BigDecimal bd2=new BigDecimal(23.12);
		System.out.println(bd2.setScale(2,RoundingMode.HALF_DOWN).toString());
		BigDecimal bd3=new BigDecimal(23.1256);
		System.out.println(bd3.setScale(2,RoundingMode.HALF_DOWN).toString());
		BigDecimal bd4=new BigDecimal(23.1223);
		System.out.println(bd4.setScale(2,RoundingMode.HALF_DOWN).toString());
		BigDecimal bd5=new BigDecimal(-23.1256);
		System.out.println(bd5.setScale(2,RoundingMode.HALF_DOWN).toString());
		System.out.println((BigDecimal.valueOf(60).multiply(bd1)).setScale(2,RoundingMode.HALF_DOWN).toString());
	}

}
