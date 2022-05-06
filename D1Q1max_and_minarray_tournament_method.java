public class D1Q1max_and_minarray_tournament_method {
    public static void main(String[] args) {
        int[] arr = {23,12,43,25,67,45,65,56,89};
        pair minmax = minmax(arr,0,arr.length-1);
        System.out.println("the max value is "+minmax.max + " the min value is "+minmax.min);

    }
    static class pair{
        int min;
        int max;
    }
    public static pair minmax(int arr[],int low , int high) {
        pair minmax = new  pair();
        pair mml = new pair();
        pair mmr = new pair();
        int mid;

        if(low == high){
            minmax.min = arr[low];
            minmax.max = arr[high];
            return minmax;
        }
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
        mid = (low + high)/2;
        mml = minmax(arr,low,mid);
        mmr = minmax(arr,mid+1,high);
        if(mml.min<mmr.min){
            minmax.min = mml.min;
        }
        else{
            minmax.min = mmr.min;
        }
        if(mml.max>mmr.max){
            minmax.max = mml.max;
        }
        else{
            minmax.max = mmr.max;
        }

        return minmax;
    }
}
