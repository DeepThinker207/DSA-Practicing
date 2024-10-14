public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 5, 7, 6, 2, 3, 4, 6};
        int a = 0;
        for(int n : nums){
            a = a^n;
        }
        System.out.println(a);

    }
}
