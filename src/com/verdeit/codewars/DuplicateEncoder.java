package com.verdeit.codewars;

public class DuplicateEncoder {
	public static void main(String[] args){
		System.out.println(encode("(( @"));
	}
	static String encode(String word){
		//String newWord;
		word = word.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char[] breakChar = word.toCharArray();
		for(char ch : breakChar){
			if(containsDuplicate(word, ch)){
				sb.append(")");
			}
			else
				sb.append("(");
		}
		word = sb.toString();
		return word;
	}

	private static boolean containsDuplicate(String word, char ch) {
		int countChar = 0;
		for(int i = 0; i < word.length(); i++){
			if(ch == word.charAt(i)){
				countChar++;
			}
		}//end for
		if(countChar > 1){
			return true;
		}
		else
			return false;
	}

}
