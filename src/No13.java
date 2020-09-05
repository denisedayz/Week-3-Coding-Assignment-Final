
public class No13 {

//This method solves the problem of helping someone choose what type of car to buy based on their favorite color
	public static void main(String[] args) {
		String favoriteColor = "white";
		String carToBuy = whatCarShouldYouBuy(favoriteColor);
		System.out.println(carToBuy);

	}
	
	public static String whatCarShouldYouBuy (String x) {
		String carType = "mustang";
		String carType2 = "prius";
		if ( x == "green" || x == "red") {
			return carType;
			}else {
				return carType2;
			}
	}
	

}
