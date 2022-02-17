package day36_overloading;

public class overload {
	public static void main(String[]args){
		
	}
	
	/*
	 *  Methods overloading - TASK 1 
	 */
	
	public static int add(int num1,int num2) {
		return num1+num2;
	}
	
	public static double add(double num1,double num2,double num3) {
		return num1+num2+num3;
	}
	
	/*
	 *  Methods overloading - TASK 2 
	 */
	
	public static boolean PlayGame(int numbOfPlayers,String players) {
		
		boolean game=true;
		if(numbOfPlayers==2) {
			 game=true;
		}
		return game;
	}
	
	public static boolean PlayGame(String players,int numbOfPlayers) {
		
		boolean game=true;
		if(numbOfPlayers==2) {
			 game=true;
		}
		return game;
	}
	
	
}
