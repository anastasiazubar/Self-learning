package _day5_operators;

public class ShortHandOperations {

	public static void main(String[] args) {
			int count = 100;
			count = count+1;
			System.out.println(count);
	//add 10 to count
			count = count + 10;
			System.out.println(count); 
	
			/*
			 * +=;/=;-=;*=
			 */ 
			
			count += 10;
			System.out.println("After + " + count);//121
			
			count -= 10;
			System.out.println("After -" + count); //111
			
			count /= 10;
			System.out.println("After /"+ count); //11
			
			count *= 10;
			System.out.println("After /" + count); //110
			

			count %= 3;
			System.out.println("After %" + count); //2
			
			/////////////////////////////////////
			
			double test = 32.54;
			test /= 2;
			System.out.println(test);
			

	}

}
