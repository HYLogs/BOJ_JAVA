package step12;

import java.util.Scanner;

public class BOJ_2231 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
		in.close();
		
		int result = 0;
		for (int i = 1; i < n; i++) {
			int num = 0;
			int copy_i = i;
			
			while (copy_i != 0) {
				num += copy_i % 10;
				copy_i /= 10;
			}
			
			num += i;
			
			if (num == n) {
				result = i;
				break;
			}
		}
			
		
		System.out.println(result);
	}
}
