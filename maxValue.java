import java.util.Arrays;
public class maxValue {
    public static int max_Val(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row_ints : arr){
            for(int element : row_ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {18, 19, 20, 21},
            {10, 15, 20, 25, 30},
            {30, 32, 34, 36},
            {29, 40}
        };
        //int max = max_Val(arr);
        System.out.println(max_Val(arr));
    }
}
