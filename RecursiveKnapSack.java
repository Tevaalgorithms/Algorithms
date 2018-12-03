package recursiveknapsack;

public class RecursiveKnapSack 
{
    public static int knapSack(int mc, int n, int[] profit, int[] weight)
    {
       
        if(mc == 0 || n == profit.length)
        {
           return 0;  
        }
        
        // if weight of thte nth item is more than Knapsack capacity W, 
        // then this item can not be included in the optimal solution
        if (weight[n] > mc)
        {
            return knapSack(mc, n+1, profit, weight);
        }
        
        // (1) nth item included  
        int include_benifits = profit[n] + knapSack(mc-weight[n], n+1, profit, weight);
       
        // (2) not included
        int exclude_benifits = knapSack(mc, n+1, profit, weight);
                     
        return max(include_benifits, exclude_benifits);
        
    }
    
    public static int max(int a, int b)
    {
        return (a > b) ? a: b;
    }
    
    public static void main(String[] args) 
    {
        int[] Profit = new int[]{60, 100, 120}; 
        int[] Weight = new int[]{10, 20, 30}; 
        int Max_Capacity = 50;                
        System.out.println(knapSack(Max_Capacity, 0, Profit, Weight));
    }
    
}
