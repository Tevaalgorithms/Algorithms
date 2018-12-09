public class DynamicKanpSac 
{
     // Returns the maximum value that can be put in a knapsack of capacity W 
    public static int Dynamic_knapSack(int max_weight, int no_of_items, int[] profit, int wt[]) 
    { 	
	int K[][] = new int[no_of_items+1][max_weight+1]; 
	
	// Build table K[][] in bottom up manner 
	for (int i = 0; i <= no_of_items; i++) 
	{ 
		for (int w = 0; w <= max_weight; w++) 
		{ 
			if (i==0 || w==0) 
				K[i][w] = 0; 
			else if (wt[i-1] <= w) 
				K[i][w] = max(profit[i-1] + K[i-1][w-wt[i-1]], K[i-1][w]); 
			else
				K[i][w] = K[i-1][w]; 
		} 
	} 
	
	return K[no_of_items][max_weight]; 
	}
    
    public static int max(int a, int b)
    {
        return (a > b) ? a: b;
    }
    
    public static int RecursiveknapSack(int max_weight, int no_of_items, int[] profit, int[] weight)
    {
       
        if(max_weight == 0 || no_of_items == profit.length)
        {
           return 0;  
        }
        
        // if weight of thte nth item is more than Knapsack capacity W, 
        // then this item can not be included in the optimal solution
        // Move to the next time in the call (no_of_items+1)
        if (weight[no_of_items] > max_weight)
        {
            return RecursiveknapSack(max_weight, no_of_items+1, profit, weight);
        }
        
        // (1) nth item included  
        int include_benifits = profit[no_of_items] + RecursiveknapSack(max_weight-weight[no_of_items], no_of_items+1, profit, weight);
       
        // (2) not included
        int exclude_benifits = RecursiveknapSack(max_weight, no_of_items+1, profit, weight);
                     
        return max(include_benifits, exclude_benifits);
        
    }
    
    public static void main(String[] args) 
    {
        int[] Profit = new int[]{60, 100, 120}; 
        int[] Weight = new int[]{10, 20, 30}; 
        int max_weight = 50;    
        int no_of_items = Profit.length;
        System.out.println(" Recursive Solution " + RecursiveknapSack(max_weight, 0, Profit, Weight));
        System.out.println(" Dynamic Solution " + Dynamic_knapSack(max_weight, no_of_items, Profit, Weight));
    }
    
}
