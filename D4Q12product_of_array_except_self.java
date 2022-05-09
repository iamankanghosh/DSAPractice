public class D4Q12product_of_array_except_self {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = new int[nums.length];
        result = productArray(nums);
        System.out.println("product of array except self : ");
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    public static int[] productArray(int arr[]) {
        int product[] = new int[arr.length];
        product[0] = 1;
        // code for product of left element;
        for (int i = 1; i < arr.length; i++) {
            product[i] = product[i-1]*arr[i-1];
        }

        // code for product of right element;
        int right = 1;
        for (int i = arr.length-1; i >=0; i--) {
            product[i] = product[i]*right;
            right = right*arr[i];
        }
        return product;
    }
}
