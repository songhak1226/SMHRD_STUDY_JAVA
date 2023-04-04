package JavaFestival배열;

public class JavaFesta배열03 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		String[] data = score.split(",");

		int numA = 0;
		int numB = 0;
		int numC = 0;
		int numD = 0;
		int numF = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("A")) {
				numA++;
			} else if (data[i].equals("B")) {
				numB++;
			} else if (data[i].equals("C")) {
				numC++;
			} else if (data[i].equals("D")) {
				numD++;
			} else if (data[i].equals("F")) {
				numF++;
			}

		}
		System.out.println("A : " + numA + "명");
		System.out.println("B : " + numB + "명");
		System.out.println("C : " + numC + "명");
		System.out.println("D : " + numD + "명");
		System.out.println("F : " + numF + "명");

	}

}
