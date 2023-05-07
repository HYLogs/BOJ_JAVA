package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] chessCount = br.readLine().split(" ");
        int[] realCount = {1, 1, 2, 2, 2, 8};

        int i = 0;
        for (String count : chessCount) {
            chessCount[i] = String.valueOf(realCount[i] - Integer.parseInt(count));
            i++;
        }
        System.out.println(String.join(" ", chessCount));
    }
}
