package step9;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14215 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[3];
		
		arr[0] = in.nextInt();
		arr[1] = in.nextInt();
		arr[2] = in.nextInt();
		in.close();
		
		Arrays.sort(arr);
		
		while(arr[2] >= (arr[0] + arr[1])) {
			arr[2]--;
		}
		
		
		int result = 0;
		for (int value: arr)
			result += value;
		
		System.out.println(result);
	}
}
