import java.util.Arrays;
public class SearchIn2dArray {
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {18, 43, 20, 46, 78},
            {3, 5, 29, 19},
            {42, 86, 49},
            {99, 12}
        };
        int target = 99;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
