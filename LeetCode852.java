public class LeetCode852 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 9, 8, 6, 3, 1};
        int ans = peakIndex(nums);
        System.out.println(ans);
    }
    static int peakIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }else if(nums[mid] < nums[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }
}
