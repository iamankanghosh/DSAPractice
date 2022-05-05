public class D1Q3maximum_subarray_for_all_pos_and_neg_and_only_neg {
    public static void main(String[] args) {
        int[] arr = {-2,-5,-3};
        int maxsum = maxSubArray(arr);
        System.out.println("maxsum of the array is "+maxsum);

        int[] arr1 = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum1= maxSubArray(arr1);
        System.out.println("maxsum of the array is "+maxsum1);
    }
    static int maxSubArray(int nums[]){
        int sum = 0;
        int max = nums[0];
        
        for (int i=0;i<nums.length;i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
}
