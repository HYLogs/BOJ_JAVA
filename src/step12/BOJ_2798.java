package step12;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_2798 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Arrays.sort(arr);
		
		int result = 0;
		for (int i = 0; i < n-2; i++)
			for (int j = i + 1; j < n-1; j++)
				for (int k = j + 1; k < n; k++) {
					int num = arr[i] + arr[j] + arr[k];
					
					if (m - num >= 0 && num > result)
						result = num;
				}
		System.out.println(result);
	}
}
