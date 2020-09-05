
public class No1c {

	public static void main(String[] args) {

		{

			int[] ages = new int[9];

			ages[0] = 3;
			ages[1] = 9;
			ages[2] = 23;
			ages[3] = 64;
			ages[4] = 2;
			ages[5] = 8;
			ages[6] = 28;
			ages[7] = 93;
			ages[8] = 10;

			int sum = 0;
			for (int age : ages) {
				sum += age;
			}
			System.out.println(sum / ages.length);

		}
	}
}
