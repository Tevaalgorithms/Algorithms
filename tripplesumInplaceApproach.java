import java.util.Arrays;

public class tripplesumInplaceApproach
{
   public static void pairSum(int[] input, int sum)
   {
        if (input.length < 2)
        {
            return;
        }
        
        Arrays.sort(input);
        
        int left;
        int right;
       
        for(int i=0; i< input.length-2; i++)
        {
            left = i + 1 ;
            right = input.length - 1;
            
            while(left < right)
            {
                int j = input[i];
                int k = input[left];
                int l = input[right];
                int inter = j + k + l;
                if(sum == inter)
                {
                    System.out.println("The numbers are : " + j + " : " + k + " : " + l );
                    left = left + 1;
                    right = right -1;
                }
                else if(sum > inter)
                {
                    left = left + 1;
                }
                else if(sum < inter)
                {
                    right = right -1 ;
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
