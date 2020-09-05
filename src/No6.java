
public class No6 {

	public static void main(String[] args) {
		String names[] = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int[] nameLengths = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i]);
		}
	
		int totalSumNoOfElementsInNameLengthsArray = 0;
		
		for (int x = 0; x < nameLengths.length; x++) {
		totalSumNoOfElementsInNameLengthsArray += nameLengths[x];
			}
		System.out.println("Sum of all the elements in the array: " + totalSumNoOfElementsInNameLengthsArray);
		}

}
