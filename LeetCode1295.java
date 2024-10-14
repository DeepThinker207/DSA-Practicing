public class LeetCode1295 {
    public static void main(String[] args) {
        int arr[] = {124, 34, 5562, 324, 34};
        int evenCount = 0;

        for(int i=0; i<arr.length; i++){
            String str = Integer.toString(arr[i]);
            if(str.length() % 2 == 0){
                evenCount++;
            }
        }

        System.out.println(evenCount);
    }
}
