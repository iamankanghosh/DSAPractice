public class D3Q9repeat_and_missing_number_array {
    public static void main(String[] args) {
        int arr[]={2,1,3,4,4};
        pair result = findMisRep(arr);
        System.out.println("missing elem is : "+result.mis+" repeating elem is : "+result.rep);
    }
    static class pair{
        int mis;
        int rep;
    }
    public static pair findMisRep(int arr[]) {
        pair misrep = new pair();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i])-1;
            if (arr[index]<0) {
                misrep.rep = arr[i];
                continue;
            }
            arr[index]=arr[index]*-1; // all elem without missing elem position elem is negetive
                                    // after the code run 
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>0) {
                misrep.mis = j+1; // mising elem is the position where sign is positive
            }
        }
        return misrep;
    }

    
}

