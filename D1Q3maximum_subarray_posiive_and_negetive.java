public class D1Q3maximum_subarray_posiive_and_negetive {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxsum = maxSubArray(arr);
        System.out.println("maxsum of the array is "+maxsum);
    }
    static int maxSubArray(int nums[]){
        int cursum =0;
        int maxsum =0;
        if(nums.length==1){
            maxsum = nums[0];
            return maxsum;
        }
        for(int i=0;i<nums.length;i++){
            cursum =  cursum+nums[i];
            if(cursum>maxsum){
                maxsum = cursum;
            }
            if (cursum<0){
                cursum = 0;
            }
        }
        return maxsum;
    }
}
