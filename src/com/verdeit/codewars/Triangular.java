package com.verdeit.codewars;

public class Triangular {

	public static void main(String[] args) {
		System.out.println(triangular(3));

	}
	public static int triangular(int n) {
		String star = "*";
		int count = 0;
		for(int k = 0; k < n; k++){
			for(int i = k; i < n; i++){
				System.out.print(star);
				count ++;
			}
			System.out.println();
		}
		return count;

	}

}
