package String;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNum {
    public static void main(String[] args) throws Exception {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        for(int i=0; i<count; i++){
            result += Character.getNumericValue(nums.charAt(i));
        }
        System.out.println(result);
    }
}
