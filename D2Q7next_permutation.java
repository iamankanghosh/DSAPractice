public class D2Q7next_permutation {
    public static void main(String[] args) {
        int arr[]={1,3,5,4,6,2};
        System.out.print("nex permutation of ");
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.print(" is : ");
        nextPermutation(arr);
        
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static void nextPermutation(int arr[]) {
        int leftindex = 0;
        int rightindex = arr.length-1;
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i]>arr[i-1]) {
                leftindex = i-1; // i is set in '5' and leftindex is 3's index so i-1
                break;
            }
        }
        for (int i = arr.length-1; i >0; i--) {
            if (arr[i]>arr[leftindex]) {
                rightindex = i;
                break;
            }
        }
        // swap leftindex elem with right index elem
        swap(arr, leftindex, rightindex);
        // reverse the array from right index to leftindex-1
        int j =arr.length-1;
        for (int i = leftindex+1; i <= (((arr.length-1) -(leftindex+1))/2+leftindex+1); i++) {
            swap(arr, i, j);
            j--;
        }
    }
    public static void swap(int arr[],int left,int right) {
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
