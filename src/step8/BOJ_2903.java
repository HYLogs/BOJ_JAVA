package step8;

import java.util.Scanner;

public class BOJ_2903 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		in.close();
		
		int n = 2;
		
		for (int i = 0; i < count; i++) {
			n += Math.pow(2, i);
		}
		
		System.out.println(n*n);
		
	}
}
