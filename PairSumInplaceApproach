package arraysum;
import java.util.Arrays;

public class PairSumInplaceApproach 
{
    /*
    Time complexity is O(n logn)
    Steps:
        1. Inplace sort the aray
        2. Keep two poiners to scan through the array and in front to back(i) and back to fron direction(j)
        3. if some of both values are equal to the given sum retun them
            3.a) If the sum value is greater than the given sum then move the right pointer backwards
            3.b) If the sum value is less than the given sum then move the left pointer forward
    */
    public static void pairSum(int[] input, int sum)
    {
        if (input.length < 2)
        {
            return;
        }
        
        Arrays.sort(input);
        
        int left = 0;
        int right = input.length-1;
        
        while(left < right)
        {
            int temp = input[right] + input[left];            
            if(temp == sum)
            {
                System.out.printf("(%d, %d) %n",  input[right],  input[left]);
                left = left + 1;
                right = right -1;                
            }
            else if(temp > sum)
            {
                right = right - 1;
            }
            else if(temp < sum)
            {
                left = left + 1;
            }
        }       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] numbers2 = { 2, 9, 3, 5, 7, 8, 6, -1 };
        int[] numbers = { 1, 4, -1, 1, 3, -2 };
        int sum = 2;
        pairSum(numbers, sum);
        
    }
}
