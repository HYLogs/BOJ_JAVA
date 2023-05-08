package step8;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_11005 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int cal = in.nextInt();
		
		ArrayList<Character> arr = new ArrayList<>();

		int remainder = 0;
		while (num != 0) {
			remainder = num % cal;
			num = num / cal;
			
			if (remainder > 9) {
				remainder += 55;
				arr.add((char)remainder);
			}
			else {
				remainder += '0';
				arr.add((char)remainder);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.size(); i++)
			sb.append(arr.get(arr.size() - (i+1)));
		
		System.out.println(sb);
		in.close();
	}
}
