import java.util.Scanner;

public class Ex03산술연산 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("WEB 점수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("ANDROID 점수 입력 : ");
		int num3 = sc.nextInt();
		
		int total = num1 + num2 + num3;
		double average = total /3;
		
		System.out.println("합계 : " + total);
		System.out.printf("평균 : %.2f", average);
		
		sc.close();

	}

}
