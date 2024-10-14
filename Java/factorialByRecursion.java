public class factorialByRecursion {
    public static void main(String[] args) {
        int a = 5;
        int ans = factorial(a);
        System.out.println(ans);
    }
    public static int factorial(int a){
        if(a == 0 || a == 1){
            return 1;
        }
        return a * factorial(a-1);
    }
}
