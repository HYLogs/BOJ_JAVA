package BasicMath;
import java.util.*;
import java.lang.Math;

public class BreakevenPoint {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        sc.close();

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int result = -1;
        if (B < C) 
            result = (int)Math.floor(A/(C-B)+1);
        System.out.println(result);
    }
}
