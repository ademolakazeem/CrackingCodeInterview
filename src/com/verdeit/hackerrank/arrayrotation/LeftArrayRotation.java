package com.verdeit.hackerrank.arrayrotation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class LeftArrayRotation {
	private static Logger logg = Logger.getLogger(LeftArrayRotation.class.getName());
	public static int[] arrayLeftRotation(int[] arr, int length, int rotnLength){
		
		 System.out.println("The original array: " + Arrays.toString(arr));
		int[] retArray = new int[length];
		int j = 0;
		//int k = rotnLength;
		//while(j < length){
			logg.info("Array: "+ "Before First Array!");
			for(int in = rotnLength; in < length; in++){
				retArray[j] = arr[in];
				j++;
			}
			logg.info("Print J: "+ j);
			logg.info("Array: "+ "Before Second Array!");
			for(int k = 0; k < rotnLength; k++ ){
				retArray[j] = arr[k];
				j++;
			}
		//}


		return retArray;

	}

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length");
		int length = scanner.nextInt();
		System.out.println("Please enter the rotation length");
		int rlength = scanner.nextInt();
		int[] arrayValue = new int[length];
		int[] arrayOutput = new int[length];

		for(int count = 0; count < length; count++){
			System.out.println("Please specify the value for the array index: " + count);
			arrayValue[count] = scanner.nextInt();
		}
		System.out.println("Finished data entry");
		arrayOutput = arrayLeftRotation(arrayValue, length, rlength);

		for(int counter = 0; counter < length; counter++ ){
			System.out.print(arrayOutput[counter] + " ");
		}


	}

}
