
public class No12 {

	public static void main(String[] args) {

		boolean isHotOutside = true;
		double moneyInPocket = 12.50;
		boolean shouldBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
				System.out.println(shouldBuyDrink);

	}


	public static boolean willBuyDrink(boolean x, double y) {
		boolean trueOrFalse;
		if ( x == true &&  y > 10.50) {
		return trueOrFalse = true;
		}else {
			return trueOrFalse = false;
		}
			}

}
