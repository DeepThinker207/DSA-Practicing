//import java.util.*;
public class LeetCode3{
    public static int digits(int[] arr){
        int nums;
        int count = 0;
        for(int num : arr){
            if(num < 0){
                num *= -1;
            }
            nums = (int)(Math.log10(num)) + 1;

            if(nums%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {16, -2345, 12, 33, 2345, 33};
        int numbers = digits(arr);
        System.out.println(numbers);
    }
}
