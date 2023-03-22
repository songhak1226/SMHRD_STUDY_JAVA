import java.util.Scanner;

public class Ex04산술연산 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int time = scanner.nextInt();

		int hour = time / (60 * 60);
		// 입력받은 시간을 3600으로 나눔 = 시간
		int minute = time / 60 - (hour * 60);
		// 입력받은 시간을 60으로 나누고 60이상 수가 나오지 않게 시간 곱하기 60을 해서 나온수를 뺴주기
		int second = time % 60;
		// 입력받은 시간을 60으로 나눈 나머지 값
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		scanner.close();

	}

}
