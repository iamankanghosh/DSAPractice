public class D2Q8best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        int price[] = {7,2,5,3,9,4};
        int result = maxProfit(price);
        System.out.println("maximum profit is : "+result);
    }
    public static int maxProfit(int arr[]) {
        // o(n) without any space 
        int minimum = arr[0];
        int maxprofit=0;
        for (int i = 0; i < arr.length-1; i++) {
            minimum=Math.min(minimum,arr[i]);
            int profit = arr[i]-minimum;
            maxprofit=Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}
