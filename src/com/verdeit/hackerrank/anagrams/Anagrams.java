package com.verdeit.hackerrank.anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {	
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
    
    
    public static int numberNeeded(String first, String second) {
        int response = -1;
        int count = 0;
      char[] firstChar = first.toCharArray();
      char[] secondChar = second.toCharArray();
      Arrays.sort(firstChar);
      Arrays.sort(secondChar);
      if(Arrays.equals(firstChar, secondChar)){
          response = 0;
          return response;
      }
        //if(firstChar.length > secondChar.length){
      StringBuilder sbRemoveChar = new StringBuilder(first);
            for(char secChar : secondChar){
              int index = sbRemoveChar.indexOf("" + secChar);
              if(index != -1){
                  sbRemoveChar.deleteCharAt(index);
                  count++; 
              }
          }
          int fir = first.length() - count;
            int sec = second.length() - count;
            response = fir + sec;
            return response;
      //}//end if
    }
}
