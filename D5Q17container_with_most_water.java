public class D5Q17container_with_most_water {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        int result = checkMaxWater(height);
        System.out.println("maximum water unit is : "+result);
    }
    public static int checkMaxWater(int arr[]) {
        int maxwater = 0;
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            maxwater = Math.max(maxwater, (r-l)*Math.min(arr[l], arr[r]));
            if (arr[l]<arr[r]) {
                l++;
            }
            else{
                r--;
            }
        }
        return maxwater ;
    }
}
