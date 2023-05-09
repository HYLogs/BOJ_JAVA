package step9;

import java.util.Scanner;

public class BOJ_1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int factor = 0;
		
		for (int i = 0; i < count; i++) {
			int num = in.nextInt();
			int sqrtNum = (int)Math.floor(Math.sqrt(num));
			
			if (num == 1) {
				factor++;
				continue;
			}
			
			for (int j = 2; j <= sqrtNum; j++) {
				if (num % j == 0) {
					factor++;
					break;
				}
			}
		}
		
		in.close();
		System.out.println(count - factor);
	}

}
