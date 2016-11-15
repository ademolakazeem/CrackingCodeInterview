package com.verdeit.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class LargeSmallStringArrayListImplementation {
	public static String HighAndLow(String numbers) {
		int arrLength = numbers.length();
		List aVal = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(numbers);
		while(st.hasMoreElements()){
			String sVal = (String) st.nextElement();
			aVal.add(Integer.parseInt(sVal));
		}
	Collections.sort(aVal);
	String smallest = String.valueOf(aVal.get(0));
	String largest = String.valueOf(aVal.get(aVal.size()-1));
	String ret = largest + " " + smallest; 
	return ret;
}
public static void main(String[] args){
	String numbers = "8 89 3 4 7";
	System.out.println("The Largest and Smallest are: " + HighAndLow(numbers));
	
}
}
