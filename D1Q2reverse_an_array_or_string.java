public class D1Q2reverse_an_array_or_string {
    public static void main(String[] args){
        String str = "Hlw I'm Ankan Ghosh";
        String result = reverse(str);
        System.out.println("String is "+str);
        System.out.println("String after reverse is "+result);
    }
    public static String reverse(String str) {
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}