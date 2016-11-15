package com.verdeit.codewars;

public class PopulationIncrement {

	public static void main(String[] args) {
		System.out.println(nbYear(1500, 5, 100, 5000));

	}
	
	public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while(p0 <= p){
        p0 = (int) ((p0 * percent/100.0) + aug + p0);
        year++;
      }
		return year;
    
    }

}
