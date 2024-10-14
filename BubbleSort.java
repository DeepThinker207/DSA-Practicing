import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 5, 4};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sorting(int[] arr){
        boolean swapped = false;
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                   arr[j] = arr[j-1];
                     arr[j-1] = temp;
                    swapped = true;
                }
            }
           if(!swapped){
                break;
            }
        }
        
    }
}
