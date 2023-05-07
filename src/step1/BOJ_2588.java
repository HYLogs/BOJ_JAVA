package step1;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> reverseIntegers = new ArrayList<Integer>();

        while (b > 0){
            int num = (b % 10) * a;
            System.out.println(num);
            reverseIntegers.add(num);
            b = b / 10;
        }

        int preInteger = 0;
        for (int i = 0; i < reverseIntegers.size(); i++) {
            if(i == 0){
                preInteger += reverseIntegers.get(i);
                continue;
            }
            preInteger += reverseIntegers.get(i) * Math.pow(10, i);
        }

        System.out.println(preInteger);
        in.close();
    } 
}
