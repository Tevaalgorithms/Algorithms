public class tripleSumNaiveApproach
{
    /*
    Time complexity is O(n*n*n)
    */
    public static void pairSum(int[] input, int sum)
    {
        if (input.length < 3)
        {
            return;
        }
        
        for(int i=0; i < input.length; i++)
        {
            int first = input[i];  
            
            for(int j = i +1; j < input.length; j++)
            {
               int second = first + input[j];
               
                for(int k = j = +1; k < input.length; k++)
                {
                    int third = second + input[k];
                    if(third == sum)
                    {
                        System.out.println(input[i] + " , " +  input[j] + " , " +  input[k]);
                    }
                }
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] numbers = { 12, 3, 4, 1, 6, 9 };
        int sum = 24;
        pairSum(numbers, sum);
        
    }  
}
