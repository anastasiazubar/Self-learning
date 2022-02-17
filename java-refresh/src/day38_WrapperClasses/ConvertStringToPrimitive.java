package day38_WrapperClasses;

import java.util.ArrayList;

public class ConvertStringToPrimitive {
	public static void main (String[]args) {
	
		///////////////////////////////////////////////////////
		System.out.println("----------------Task with integer 1----------------");
		///////////////////////////////////////////////////////
		String count ="432";
		int iCount = Integer.parseInt(count); //convert string to integer
			if(iCount>0) {
				System.out.println("Count is positive");
			}else {
				System.out.println("Count is negative");
			}
	
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task with double 2----------------");
		///////////////////////////////////////////////////////
		String str = "Price is 455.30";
		String[]sp=str.split(" ");
		Double price = Double.parseDouble(sp[2]);
		
		if(price>0) {
			System.out.println("price is positive");
		}else {
			System.out.println("price is negative");
		}
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task 3----------------");
		///////////////////////////////////////////////////////
		
		String etsy = "Wooden spoons (34,950 Results)";
		String[]etsyArray = etsy.split(" ");
		String strSpoonResult = etsyArray[2].replace("(", "").replace(")", "").replace(",", "");
		
		int WoodenSpoonsCount = Integer.parseInt(strSpoonResult);
		
		if(WoodenSpoonsCount>0) {
			System.out.println("wooden spoons count is: "+WoodenSpoonsCount);
		}else {
			System.out.println("wooden spoons count not found");
		}
		
		///////////////////////////////////////////////////////
		System.out.println("----------------Task 4----------------");
		///////////////////////////////////////////////////////
		
		String[]sNums = {"234","324","232","322","44"};
		ArrayList<Integer> listNums = new ArrayList<>();
		
		for(String num:sNums) {
			listNums.add(Integer.valueOf(num));
		}
		System.out.println(listNums);
		}
}
