
public class No10 {

	public static void main(String[] args) {

		// return average of doubles in array

		double[] sampleArray = new double[4];

		sampleArray[0] = 5.5;
		sampleArray[1] = 5.0;
		sampleArray[2] = 5.5;
		sampleArray[3] = 5.0;

		System.out.println(avgArray(sampleArray));
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
