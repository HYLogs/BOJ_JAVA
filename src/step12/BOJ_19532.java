package step12;

import java.util.Scanner;

public class BOJ_19532 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int f = in.nextInt();
		in.close();
		
		
		boolean isFind = false;
		String result = "";
		for (int i = -999; i <= 999; i++) {
			for (int j = -999; j <= 999; j++) {
				if (a*i + b*j == c && d*i + e*j == f) {
					isFind = true;
					result = i + " " + j;
					break;
				}
			}
			if (isFind) break;
		}
		
		System.out.println(result);
	}

}
