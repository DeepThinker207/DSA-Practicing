import java.util.Arrays;
public class JavaPractice {
    public static void main(String[] args){
        int[] arr = {0, 2, 1, 3};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != i){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
