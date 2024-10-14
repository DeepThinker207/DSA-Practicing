public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] bitonicArray = {1, 5, 9, 13, 11, 8, 7, 4};
        int target = 8;
        int ans = answerFound(bitonicArray, target);
        System.out.println(ans);
    }
    static int answerFound(int[] arr, int target){
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(arr[peak] == target){
            return target;
        }
        if(firstTry != -1){
            return firstTry;
        }else{
            return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
        }
    }
    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start < end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
