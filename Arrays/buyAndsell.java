public class buyAndsell 
{
    public static void buyAndSell(int a[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<a.length;i++)
        {
            if(buyPrice<a[i])
            {
                int profit = a[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice =a[i];
            }
        }
        System.out.print("Maximum Profit Of Stock :"+maxProfit);
    }
    public static void main(String arg[])
    {
        int prices[] = {8,2,5,1,7,4,9,4,2};
        System.out.print("Daily prices For Stocks :");
        for(int i=0;i<prices.length;i++)
        {
            System.out.print(prices[i]+" ");
        }
        System.out.println();
        buyAndSell(prices);
    }    
}
