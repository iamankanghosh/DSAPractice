public class D1Q1max_and_minarray {
    public static void main(String[] args) {
        int[] arr = {23,12,43,25,67,45,65,56,89};
        pair minmax = minmax(arr);
        System.out.println("the max value is "+minmax.max + " the min value is "+minmax.min);

    }
    static class pair{
        int min;
        int max;
    }
    public static pair minmax(int arr[]) {
        pair minmax = new  pair();
        int n = arr.length;
        if(n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
            return minmax;
        }
        if(arr[0]<arr[1]){
            minmax.min = arr[0];
            minmax.max = arr[1];
        }
        else{
            minmax.min = arr[1];
            minmax.max = arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]<minmax.min){
                minmax.min = arr[i];
            }
            if(arr[i]>minmax.max){
                minmax.max = arr[i];
            }
        }
        return minmax;
    }
}
