
public class No2a {

	public static void main(String[] args) {

//provides average letters per name in an array of strings
		String names [] = {"Sam","Tommy", "Tim", "Sally", "Buck", "Bob"};
	 
		int totalSumOfNameChars= 0;
		for (int i = 0; i< names.length; i++) {
						
			int indivSumOfNameChars = names[i].length();
			totalSumOfNameChars = totalSumOfNameChars + indivSumOfNameChars;
		 }
		System.out.println(totalSumOfNameChars/names.length);
		
		for (int i = 0; i< names.length; i++) {
			System.out.print(names[i] + " ");
		}
		
				 }
		

				 
}
			
		 
		 
	


