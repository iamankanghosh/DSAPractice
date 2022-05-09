import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class D4Q16_3sum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ll = new LinkedList<>();
        ll = threeSum(arr);
        System.out.println(ll);
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> llall = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (s.contains(0-arr[i]-arr[j])) {
                    if ( !llall.contains(Arrays.asList(arr[i],arr[j],0-arr[i]-arr[j]))) {
                        llall.add(Arrays.asList(arr[i],arr[j],0-arr[i]-arr[j]));
                    }
                }
            }
        }

        return llall;
    }
}
