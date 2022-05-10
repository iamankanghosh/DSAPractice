import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class D5Q16_3sum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ll = new LinkedList<>();
        ll = threeSum(arr);
        System.out.println(ll);
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> llall = new LinkedList<>();
        // two pointer approach
        for (int i = 0; i < arr.length; i++) {
            if (i==0 || (i>0 && arr[i] != arr[i-1])) {
                int lo = i+1 ;
                int hi = arr.length-1 ;
                int sum = 0 - arr[i];
                while (lo < hi) {
                    if (arr[lo] + arr[hi] == sum) {
                        List<Integer> lls = new LinkedList<>();
                        lls.add(arr[i]);
                        lls.add(arr[lo]);
                        lls.add(arr[hi]);
                        llall.add(lls);

                        // code for leave same element ;
                        while (lo<hi && arr[lo]== arr[lo+1]) { lo++ ;}
                        while (lo<hi && arr[hi]== arr[hi-1]) { hi-- ;}
                        lo++;
                        hi--;
                    }
                    else if(sum > arr[lo]+arr[hi]){
                        lo++;
                    }
                    else {
                        hi--;
                    }
                }
            }
        }

        return llall;
    }
}
