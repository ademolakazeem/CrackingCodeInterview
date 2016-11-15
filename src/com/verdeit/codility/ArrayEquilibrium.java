package com.verdeit.codility;

public class ArrayEquilibrium {

	public static void main(String[] args) {
		int[] A = {-1,3,-4,5, 1, -6, 2, 1};
		System.out.println(solution(A));
	}
	public static int solution(int[] A) {
        int leftSumArray = 0;
        int rightSumArray = 0;
        int index = -1;
        for(int i = 0; i < A.length; i++){
            leftSumArray+= A[i];
        }//end for
        for(int j = A.length-1; j >= 0; j--){
            rightSumArray+= A[j];
            leftSumArray-= A[j];
            if(leftSumArray == rightSumArray){
                    index = j;
                    break;
                    
                }//end if
            
            }//end for 
 
   
   
   return index;
    
    }

}
