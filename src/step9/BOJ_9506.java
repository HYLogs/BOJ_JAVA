package step9;

import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_9506 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num;
		while ((num = in.nextInt()) != -1) {
			ArrayList<Integer> factors = new ArrayList<>();
			int sum = 0;
			
			for (int i = 1; i <= num/2; i++) {
				if (num % i == 0) {
					factors.add(i);
					sum += i;
				}
			}				
			
			
			if (sum == num) {
				sb.append(num).append(" = ");
				for (int i = 0; i < factors.size(); i++)
					sb.append(factors.get(i)).append(" + ");
				sb.delete(sb.length()-3, sb.length());
			}
			else {
				sb.append(num).append(" is NOT perfect.");
			}

			sb.append("\n");
		}
		in.close();
		System.out.println(sb);
	}
}
