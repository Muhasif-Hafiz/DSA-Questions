
public class BesttBuyStock121 {
    public static void main(String[] args) {
        int [] arr={7,6,4,3,1};
        int ans=maxProfit(arr);
        System.out.println(ans);

    }

    // Fails Some testCases
    // Do with Dynammic Programmic

    public static int maxProfit(int[] prices) {

        int min=Integer.MAX_VALUE;
        int buyDay=0;
        int max=Integer.MIN_VALUE;


        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                buyDay=i;
            }
        }
        for(int i=buyDay;i<prices.length;i++){

            if(max <prices[i]) {
                max = prices[i];
            }
        }
        return max-min;

    }


}

