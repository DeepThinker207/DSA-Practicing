public class LeetCode1095 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 9, 12, 15,17,14, 13, 5, 3};
        int target = 5;
        int ans = answer(nums, target);
        System.out.println(ans);
    }
    static int answer(int[] nums, int target){
        int peak = peakIndex(nums);
        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(nums, target, peak+1, nums.length-1);
    }
    static int peakIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] nums, int target, int start, int end){
        boolean isAsc = nums[start] < nums[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(isAsc){
                if(target < nums[mid]){
                    end = mid-1;
                }else if(target > nums[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }  
            }else{
                if(target < nums[mid]){
                    start = mid+1;
                }else if(target > nums[mid]){
                    end = mid-1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    
}
