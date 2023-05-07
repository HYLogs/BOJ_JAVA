package step8;
import java.util.*;

public class BOJ_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();
        sc.close();
        
        System.out.println(find(input));
    }

    private static String find (int input){
        int left = 1;
        int right = 1;

        int i = 1;
        int j = 0;
        while (true){
            int currentDirection = i % 2;
            if (input == i+j) return left + "/" + right;
            do {
                if (left == 1 && right == 1) break;
                left += currentDirection * (-2) + 1;
                right += currentDirection * 2 - 1;
                j++;
                if (input == i+j) return left + "/" + right;
            } while (left != 1 && right != 1);

            if (currentDirection == 1) right++;
            else left++;

            i++;
        }
    }
}