package com.verdeit.hackerrank.anagrams;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringAnagrams {

	private static Logger logg = Logger.getLogger(StringAnagrams.class.getName());
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please specify the first word");
		String firstWord = scanner.next();
		System.out.println("Please specify the second word");
		String secondWord = scanner.next();
		if(isAnagram(firstWord, secondWord)){
			System.out.println(firstWord + " is the anagram of " + secondWord);
		}
		else
			System.out.println(firstWord + " is not an anagram of " + secondWord);
		System.out.println(neededToMakeAnagrams(firstWord, secondWord));

	}

	private static int neededToMakeAnagrams(String firstWord, String secondWord) {
		int remLength = -1;
		StringBuilder anagramBuilder = null;
		char[] firstChars = firstWord.toCharArray();
		for(char ch : firstChars){
			if(isContains(secondWord, ch)){
				if(anagramBuilder == null){
					anagramBuilder = new StringBuilder();
				}
				anagramBuilder.append(ch);
			}
		}//end for
		if(anagramBuilder != null){
			if(firstWord.length() == secondWord.length()){
				logg.info("Inside firstWord = secondWord");
				remLength = (firstWord.length() - anagramBuilder.toString().length())*2;
				logg.info("remLength when equals: " + remLength);
			}//the same length
			else if(firstWord.length() != secondWord.length()){
				logg.info("Inside firstWord != secondWord");
				int remFirst = firstWord.length() - anagramBuilder.toString().length();
				int remSecond = secondWord.length() - anagramBuilder.toString().length();
				remLength = remFirst + remSecond;
				logg.info("length not the same: " + remLength);
			}
		}//anagram not null

		System.out.println("The anagram builder is: " + anagramBuilder);
		return remLength;
	}
	public final static boolean isContains(String word, char c){
		char[] character = word.toCharArray();
		boolean response = false;
		for(char ch : character){
			if(ch == c){
				response = true;
				break;
			}
		}
		return response;

	}//end isContain

	public static boolean isAnagram(String word, String anagram){       
		if(word.length() != anagram.length()){
			return false;
		}

		char[] chars = word.toCharArray();

		for(char c : chars){
			int index = anagram.indexOf(c);
			if(index != -1){
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length());
			}else{
				return false;
			}           
		}

		return anagram.isEmpty();
	}

}//end Class
