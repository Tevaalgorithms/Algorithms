
public class PairSumNaiveApproach 
{
    /*
    Time complexity is O(n*n)
    */
    public static void pairSum(int[] input, int sum)
    {
        if (input.length < 2)
        {
            return;
        }
        
        for(int i=0; i < input.length; i++)
        {
            int first = input[i];
            for(int j = i +1; j < input.length; j++)
            {
                int second = sum - first;
                if(input[j] == second)
                {
                    System.out.println(input[i] + " , " +  input[j]);
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] numbers = { 2, 9, 3, 5, 7, 8, 6, -1 };
        int sum = 8;
        pairSum(numbers, sum);
        
    }
    
}
