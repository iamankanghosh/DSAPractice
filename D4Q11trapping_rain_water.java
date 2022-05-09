public class D4Q11trapping_rain_water {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,4,2,1,2,1};
        int result = trap(height);
        System.out.println("water unit can trap after raining : "+result);
    }
    public static int trap(int arr[]) {
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        int maxl=0;
        int maxr=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxl) {
                maxl=arr[i];
                leftmax[i]=maxl;
            } else {
                leftmax[i]=maxl;
            }
        }
        for (int j = arr.length-1; j >=0 ; j--) {
            if (arr[j]>maxr) {
                maxr=arr[j];
                rightmax[j]=maxr;
            } else {
                rightmax[j]=maxr;
            }
        }
        int waterunit=0;
        for (int k = 0; k < rightmax.length; k++) {
            waterunit = waterunit + Math.min(leftmax[k], rightmax[k])-arr[k];
        }
        return waterunit;
        
    }
}