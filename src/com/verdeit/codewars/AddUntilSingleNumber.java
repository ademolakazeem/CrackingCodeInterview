package com.verdeit.codewars;

public class AddUntilSingleNumber {

	public static void main(String[] args) {
		int number = 132189;
		//493193;
		//942
		System.out.println(singleNumberReturn(number));


	}//end main

	public static int singleNumberReturn(int number){
		int remainder;
		int sumRet = 0;
		int divide = number;
		while(divide >  9){
			int sum = 0;
			while(divide > 0){
				remainder = divide%10;
				sum += remainder;
				divide /= 10;
				System.out.println("The remainder: " + remainder + " The divide: " + divide);
			}//end inner while
			if(sum > 9)
			divide = sum;
			else if(sum <= 9){
				sumRet = sum;
				//break;
				
			}
				
			System.out.println("The Sum: " + sum);
		}//end while

		return sumRet;
	}

}
