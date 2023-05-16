package step12;

import java.util.Scanner;

public class BOJ_1436 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		int six = 665;
		int count = 0;
		
		while (count != n) {
			six++;
			
			if (String.valueOf(six).contains("666")) {
				count++;
			}
		}
		
		System.out.println(six);
	}

}
