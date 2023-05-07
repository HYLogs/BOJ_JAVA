package step6;

import java.util.Scanner;

public class BOJ_2444 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		for (int i=1; i <= num; i++) {
			for (int j=0; j < num-i; j++) {
				System.out.print(' ');
			}
			for (int k=0; k < 2*i-1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for (int i=num-1; i > 0; i--) {
			for (int j=0; j < num-i; j++) {
				System.out.print(' ');
			}
			for (int k=0; k < 2*i-1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
