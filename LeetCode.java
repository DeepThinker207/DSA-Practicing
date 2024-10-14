public class LeetCode{
    public static int Digit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static boolean Even(int num){
        int NumberOfDigits = Digit(num);
        return NumberOfDigits % 2 == 0;
    }
    public static int TotalEvenNumbers(int[] arr){
        int count = 0;
        int num;
        for(int index=0; index<arr.length; index++){
            num = arr[index];
            if(Even(num)){
                count++;
            }
            // return count;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {124, 34, 5562, 324, 34};
        int EvenNumbersInArr = TotalEvenNumbers(arr);
        System.out.println(EvenNumbersInArr);
    }
}
