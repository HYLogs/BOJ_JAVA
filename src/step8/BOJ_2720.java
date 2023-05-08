package step8;

import java.util.Scanner;

public class BOJ_2720 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.nextLine();
		
		int[] exchangeValue = new int[] {25, 10, 5, 1};
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < count; i++) {
			int c = in.nextInt();
			for (int j = 0; j < 4; j++) {
				sb.append(c / exchangeValue[j] + " ");
				c %= exchangeValue[j];
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		in.close();
	}
}
