import java.util.Scanner;

public class Ex05산술연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		//3723ch -> 1tl(3600초) 2분(60초) 3초
		
		int hour = input/(60*60);
		int min = (input%3600)/60;
		int sec = input%60;
		
		System.out.println(hour+"시"+min+"분"+sec+"초");
		
		sc.close();

	}

}
