
public class No11 {

	public static void main(String[] args) {
		double[] array1 = new double[4];

		array1[0] = 4.0;
		array1[1] = 5.0;
		array1[2] = 6.0;
		array1[3] = 5.0;

		double avgArray1 = (avgArray(array1));

		double[] array2 = new double[4];

		array2[0] = 1.0;
		array2[1] = 2.0;
		array2[2] = 3.0;
		array2[3] = 2.0;

		double avgArray2 = (avgArray(array2));

		if (avgArray1 > avgArray2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static double avgArray(double[] values) {
		double sum = 0;
		//sum is starting point for values that will be passed in from array
		for (double value : values) {
			sum += value;
		}
		return sum / values.length;

	}

}
