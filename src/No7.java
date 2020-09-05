
public class No7 {

	public static void main(String[] args) {
		
		String greeting = "Yo! ";
		int repeat = 3;
			
		System.out.println(greetingRepeated(greeting, repeat));
	}

	public static String greetingRepeated(String greeting, int repeatTimes) {
		String result = " ";
		for (int i = 0; i < 3; i++) {
			result += greeting;
		}
		return result;
	}

}

