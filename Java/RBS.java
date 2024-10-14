public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3};
        System.out.println(find(arr, 1, 0, arr.length - 1));
    }

    public static int find(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return find(arr, target, s, e = m - 1);
            } else {
                return find(arr, target, s = m + 1, e);
            }
        }
        if (target <= arr[s] && target >= arr[m]) {
            if (target >= m && target <= arr[e]) {
                return find(arr, target, s = m + 1, e);
            } else {
                return find(arr, target, s, e = m - 1);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return find(arr, target, s = m + 1, e);
        }
        return find(arr, target, s, e = m - 1);
    }
}
