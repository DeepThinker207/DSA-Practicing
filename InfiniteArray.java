public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 8, 13, 15, 23, 28, 30, 32, 35, 37, 45, 50};
        int target = 23;
        int ans = ans(nums, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }
}
