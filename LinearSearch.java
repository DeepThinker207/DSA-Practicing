public class LinearSearch{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int N = arr.length;
        int n = 20;
        int index = LinearSearchAlgorithm(arr, N, n);
        System.out.println(index);
    }
    
    public static int LinearSearchAlgorithm(int[] arr, int N, int n){
        if(N == 0){
            return -1;
        }
        for(int index = 0; index < N; index++){
            if(arr[index] == n){
                return index;
            }
        }
        return -1;
        
    }
}