import java.util.HashSet;

public class D1Q4contains_duplicate {
    public static void main(String[] args) {
        int arr[] = {10, 4, 3, 5, 6};
        boolean result = checkDuplicate(arr);
        if (result == true){
           System.out.println("Yes, it has duplicate value ");
        }
        else{
           System.out.println("No, it has no duplicate value");
        }   
    }
    public static boolean checkDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
