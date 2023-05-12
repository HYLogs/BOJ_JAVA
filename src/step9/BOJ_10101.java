package step9;

import java.util.Scanner;

public class BOJ_10101 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		in.close();
		
		String result;
		int sum = A + B + C;
		
		if (sum != 180) {
			result = "Error";
		}else if(A == B && B == C) {
			result = "Equilateral";
		}else if(A == B || B == C || A == C) {
			result = "Isosceles";
		}else {
			result = "Scalene";
		}
		
		System.out.println(result);
	}
	
}
