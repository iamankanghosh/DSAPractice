import java.util.HashSet;

public class D5Q18given_sum_pair {
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 17;
        if (pairInArr(arr,sum)){
            System.out.print("Array has two elements with sum " + sum);
        }
            
        else{
            System.out.print("Array doesn't have two elements with sum" +sum);
        }
    }
    public static boolean pairInArr(int arr[], int sum) {
        
        HashSet<Integer> s = new HashSet<>();
        for (int i : arr) {
            s.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(sum-arr[i])) {
                return true;
            }
        }
        return false;
    }
    
}
