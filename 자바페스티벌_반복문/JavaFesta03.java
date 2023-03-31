
public class JavaFesta03 {

	public static void main(String[] args) {

		int num = 0;
		int i = 1;
		while (i <= 100) {
			
			if (i % 2 == 1) {
				System.out.print(i + " -");
				num = num + i;
			} else if (i % 2 == 0) {
				System.out.print(i + " ");
				num = num - i;
			}
			i++;
		}
		System.out.println();
		System.out.println("결과 : " + num);

	}

}
