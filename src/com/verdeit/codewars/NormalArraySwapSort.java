package com.verdeit.codewars;

import java.util.Arrays;

public class NormalArraySwapSort {

	public static void main(String[] args) {
		int[] arrSort = {20, 4, -9, 25, 15, 10, 2, 1, 4, 5, 12, 7, 9};
		System.out.println(Arrays.toString(arraySort(arrSort)));

	}

	private static int[] arraySort(int[] arrSort) {
		int temp;
		for(int i = 0; i < arrSort.length; i++){
			for(int j = 0; j < arrSort.length-1; j++){
				if(arrSort[j] > arrSort[j+1]){
					temp = arrSort[j];
					arrSort[j] = arrSort[j+1];
					arrSort[j+1] = temp;
				}
			}
		}
		return arrSort;
	}

}
