import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 23, 2, 9, 8};
        mergeSortInPlace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int[] arr, int s, int e){
        if(s >= e){
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid + 1, e);
        mergeInPlace(arr, s, mid, e);
    }
    static void mergeInPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while(i < mid && j < e){
            if(arr[i] <= arr[j]){
                mix[k++] = arr[i++];
            }else{
                mix[k++] = arr[j++];
            }
        }
        while(i < mid){
            mix[k++] = arr[i++];
        }
        while(j < e){
            mix[k++] = arr[j++];
        }
        for(int l = 0; l < mix.length; l++)
            arr[s + l] = mix[l];
    }
}
