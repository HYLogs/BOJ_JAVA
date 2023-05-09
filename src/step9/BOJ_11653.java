package step9;

import java.util.Scanner;

public class BOJ_11653 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		StringBuilder sb = new StringBuilder();
		in.close();
		
		while(num != 1) {
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					sb.append(i).append("\n");
					num /= i;
					break;
				}
			}
		}
		System.out.println(sb);
	}
}
