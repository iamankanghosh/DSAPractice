public class D2Q6search_an_element_in_a_sorted_and_pivoted_array {
    public static void main(String args[])
    {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr.length;
        int key = 7;
        System.out.println("Index of the element is : "+ pivotedBinarySearch(arr, n, key));
    }
    static int pivotedBinarySearch( int arr[],int n, int k){
        int pivot = findPivot(arr,0,n-1);
        if(arr[pivot]==k){
            return pivot;
        }
        if (k>=arr[0]) {
            return binarySearch(arr,0,pivot-1,k);
        }
        return binarySearch(arr,pivot+1,n-1,k);
    }
    static int findPivot(int arr[],int low,int high) {
        if (high<low){
            return -1;
        }
        if (high == low) {
            return low ;
        }
        int mid = (low + high)/2; 
        if(mid<high && arr[mid]>arr[mid+1]){
            return mid;
        }
        if(mid>low && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[mid]<=arr[low]){
            return findPivot(arr, low, mid-1);
        }
        return findPivot(arr, mid+1, high);
    }
    static int binarySearch(int arr[],int low,int high,int k ){
        int mid = (low+high)/2;
        if (high < low){
            return -1;
        }
        if(k == arr[mid]){
            return mid;
        }
        if (k > arr[mid])
            return binarySearch(arr, (mid + 1), high, k);
        return binarySearch(arr, low, (mid - 1), k);
        
    }
}