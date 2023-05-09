package step9;

import java.util.Scanner;
import java.util.ArrayList;

public class BOJ_2501 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int index = in.nextInt() - 1;
		int result = 0;
		in.close();
		
		ArrayList<Integer> factors = new ArrayList<>();
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				factors.add(i);
		}
		
		if (factors.size() > index)
			result = factors.get(index);
		System.out.println(result);
	}

}
