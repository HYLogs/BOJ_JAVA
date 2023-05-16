package step12;

import java.util.Scanner;

public class BOJ_2839 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		
		
		int result = -1;
		for (int i = 0; i <= N / 5; i++) {
			for (int j = 0; j <= N / 3; j++) {
				int num = i*5 + j*3;
				if (num > N) break;
				if (num == N) result = i+j;
			}
		}
		
		System.out.println(result);
	}

}
