package com.verdeit.codility;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(convertToBinary(12));

	}
	public static int convertToBinary(int N){

		StringBuilder sb = new StringBuilder();
		int remainder;
		int divide = N;
		while(divide > 0){
			remainder = divide%2;
			sb.append(remainder);
			divide /= 2;
		}//end
		sb = sb.reverse();
		System.out.println(N + " in binary is: " + sb.toString());
		char[] binaryArray = sb.toString().toCharArray();
		
		int count = 0;
		int finalCount = 0;
		
		for(char bChar : binaryArray ){
			if(bChar == '0'){
				count++;
			}
			if(bChar == '1'){
				if( finalCount < count){
					finalCount = count;
				}
				count = 0;

			}
			if( finalCount < count){
				finalCount = count;
			}
			
			
		}
		return finalCount;
	}

}
