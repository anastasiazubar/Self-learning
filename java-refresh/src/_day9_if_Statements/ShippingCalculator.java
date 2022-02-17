package _day9_if_Statements;

public class ShippingCalculator {

	public static void main(String[] args) {
				
		int Shipping_mode = 2; // 1 - regular, 2 - express
		double purchacePrice = 77.0;
		double shippingCoast = 0.0;

		if(Shipping_mode == 1) {
			System.out.println("==Regular shipping==");
			if(purchacePrice>=1.0 && purchacePrice<=100.0 ) {
				shippingCoast=17.0;
			}else if(purchacePrice>=100.1 && purchacePrice<=300){
				shippingCoast=10.0;
			}else if(purchacePrice>=100.1 && purchacePrice<=300){
				shippingCoast=0.0;
			}
		}else if (Shipping_mode == 2) {
			System.out.println("==Express shipping==");
			if(purchacePrice>=1.0 && purchacePrice<=100.0 ) {
				shippingCoast=32.0;
			}else if(purchacePrice>=100.1 && purchacePrice<=300){
				shippingCoast=22.0;
			}else if(purchacePrice>=100.1 && purchacePrice<=300){
				shippingCoast=15.0;
			}
		}else {
			System.out.println("Shipping_mode selected wrong. Not able to calculate");
		}
		
		System.out.println("Shipping cost: "+ shippingCoast );

	}

}
