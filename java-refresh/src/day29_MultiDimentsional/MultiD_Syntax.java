package day29_MultiDimentsional;

import java.util.Arrays;

public class MultiD_Syntax {
	public static void main (String[]args) {
		
		double[][]prices = new double [3][];
		
		prices[0] = new double [] {23.45,75.65,60.90};
		prices[1] = new double [] {232.54,545.66};
		prices[2] = new double[5];
		prices[2][0]=34.54;
		prices[2][1]=900.55;
		prices[2][2]=304.34;
		
		System.out.println(Arrays.deepToString(prices));
		
	}
}
