package step9;

import java.util.Scanner;

public class BOJ_2581 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int min = -1;
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			if (i == 1) continue;
			
			Boolean isFactor = false;
			for (int j = 2; j <= Math.sqrt(i); j ++) {
				if (i%j == 0) {
					isFactor = true;
					break;
				}
			}
			if (!isFactor && min == -1) {
				min = i;
				sum += i;
			}
			else if(!isFactor) {
				sum += i;
			}
		}
		
		if (sum != 0)
			System.out.println(sum);
		System.out.println(min);
		
		in.close();
	}
}
