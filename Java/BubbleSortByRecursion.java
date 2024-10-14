public class BubbleSortByRecursion {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 16, 20};
        selection(arr, 0, arr.length-1);

    }
    static void selection(int[] arr, int r, int c)
    {
        if(r==0) return;
        if(r>c)
        {
            if(arr[c]>arr[r])
            {
                int t=arr[c];
                arr[c]=arr[r];
                arr[r]=t;
            }
            selection(arr,r,c+1);
        }
        else{
            selection(arr,r-1,0);
        }
    }
}
