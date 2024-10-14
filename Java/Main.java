public class Main {
    public static void main(String[] args) {
        // reset th ith bit of a number n and then print the reset number.
        int n = 86;
        int ith = 5;
        ans(n, ith);

    }

    public static void ans(int n, int ith){
        int totalBits = (int)(Math.log(n) / Math.log(2)) + 1;
        int largestNum = (int)((Math.pow( 2, totalBits)) - 1);
        largestNum = largestNum << 5;
        int largestNum2 = (int)(Math.pow(2, (ith - 1)) - 1);
        int mask = largestNum | largestNum2;
        n = n & mask;
        System.out.println(n);
    }
}
