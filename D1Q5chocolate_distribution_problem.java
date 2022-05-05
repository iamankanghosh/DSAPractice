import java.util.Arrays;

public class D1Q5chocolate_distribution_problem {
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23,25, 41, 30, 40, 28,42, 30, 44, 48, 43,50};
        int m = 7;
        int mindiff = minDiff(arr,m);
        System.out.println("Minimum difference is "+ mindiff);
    }
    public static int minDiff(int arr[],int m) {
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[n-1];
        for (int i = 0; i+(m-1) < n; i++) {
            int diff = arr[i+m-1]-arr[i];
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
