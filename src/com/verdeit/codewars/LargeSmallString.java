package com.verdeit.codewars;

import java.util.Arrays;

public class LargeSmallString {
	public static void main(String[] args) {

		int aVal[] = {1, 3, 5, 7, 2};
		String numbers =  "1 3 5 7 2";
		System.out.println(HighAndLow(numbers));
	}

	public static String HighAndLow(String numbers) {
		int in = 0;
		String sVal = numbers.replaceAll(" ", "");
		int arrLength = sVal.length();
		int aVal[] = new int[arrLength];
		char[] cVal = sVal.toCharArray();
		System.out.println("the actual number is: " + numbers);
		System.out.println("sVal is: " + sVal + " the length is: " + aVal.length);

		for(char cc : cVal){
			aVal[in] = Character.getNumericValue(cc);
			System.out.println("aVal: " + aVal[in] + " cc: " + cc);
			in++;
		}
		//System.out.println("Sval " + sVal);
		//    int iVal = Integer.parseInt(sVal);
		//   aVal[in] = iVal;
		//   System.out.println("aVal: " + aVal[in]);
		//   ++in;

		Arrays.sort(aVal);
		String smallest = String.valueOf(aVal[0]);
		String largest = String.valueOf(aVal[aVal.length-1]);
		return largest + " " + smallest;

	}
}
