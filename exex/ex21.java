package exex;

public class ex21 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 42, 9, 81, 2, 68 };

		int min = Math.abs(point[0] - point[1]);

		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					if (Math.abs(point[i] - point[j]) < min) {
						min = Math.abs(point[i] - point[j]);
						num1 = i;
						num2 = j;
					}
				}
			}
		}
		System.out.println(num1 + " " + num2);

	}

}
