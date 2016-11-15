package com.verdeit.codility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTaken {

	public static void main(String[] args) {
		System.out.println("The cost is: " + solution("09:42", "11:42"));
		//System.out.println("The cost is: " + solution("10:00", "13:21"));

	}
	
	public static int solution(String E, String L)  {
		int cost = 2;
       SimpleDateFormat sDFormat = new SimpleDateFormat("HH:mm");
       try {
		Date entranceTime = sDFormat.parse(E);
		Date leftTime = sDFormat.parse(L);
		long timeDefmills = leftTime.getTime()-entranceTime.getTime();
		long totalSeconds = timeDefmills/1000;
		long hours = totalSeconds /3600;
		long minutes = (totalSeconds / 60) % 60;
		long seconds = totalSeconds % 60;
		System.out.println("The Hour: " + hours + " the mins: " + minutes);
		int hr = 1;
		cost+=3;
		while(hr <= hours )
		{
			//if(minutes > 0){
				cost+=4;
		//	}
				
		hr++;
       }
	if(minutes <= 0)
			cost-=4;
       
	} catch (ParseException e) {
		e.printStackTrace();
	}
       
       
		return cost;
        
    }

}
