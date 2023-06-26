package step14;

import java.util.Scanner;

public class BOJ_13241 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long a = in.nextLong();
		Long b = in.nextLong();
		in.close();
		
		Long result = a * b / gcd(a, b);
		
		System.out.println(result);
	}
	
	public static Long gcd(Long a, Long b) {
		while (b != 0) {
			Long r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
}
