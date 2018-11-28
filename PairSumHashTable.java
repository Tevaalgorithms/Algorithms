import java.util.HashSet;
import java.util.Set;

public class PairSumHashTable 
{
    /*
    Time Complexity: O(n)
    Space Complexity: O(n) for extra hashtable
    */
    public static void pairSum(int[] input, int sum)
    {
        if (input.length < 2){
            return;
        }
        
        Set h_set = new HashSet(input.length);        
        
        for(int i=0; i < input.length; i++)
        {
            int target = sum - input[i];
            
            if(!h_set.contains(target))
            {
                h_set.add(input[i]);
            }
            else
            {
               System.out.printf("(%d, %d) %n",  input[i], target); 
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
