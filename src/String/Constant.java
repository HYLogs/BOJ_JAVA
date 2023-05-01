package String;
import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        sc.close();

        int isMax = 2;
        for(int i=2; i >= 0; i--){
            if(nums[0].charAt(i) > nums[1].charAt(i)){
                isMax = 0;
                break;
            }
            else if (nums[0].charAt(i) < nums[1].charAt(i)){
                isMax = 1;
                break;
            }
        }
        System.out.println(new StringBuffer(nums[isMax]).reverse().toString());
    }
    
}