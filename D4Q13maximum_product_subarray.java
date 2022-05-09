public class D4Q13maximum_product_subarray {
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        int result = maxProduct(arr);
        System.out.println("maximum product of subarray : "+result);
    }
    public static int maxProduct(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        if (arr.length == 0) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
            min = Math.min(Math.min(temp * arr[i], min * arr[i]), arr[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}
