
public class No9 {

	public static void main(String[] args) {

		int[] ints = { 25, 25, 50, 50, 50 };
		
		if (sumOfAllInts(ints) > 100) {
			System.out.println("true");
		}else {
			System.out.println();
		}

	}

	public static int sumOfAllInts(int[] integers) {
		int sum = 0;
		for (int integer : integers) {
			sum += integer;
		}
		return sum;
	}

}
