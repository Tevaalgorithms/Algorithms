
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadane_Algorithm 
{
    /*
      Kadane’s Algorithm to find maximum sum.
      Time complexity: O(n)
    */
    public static void maxSum(int[] arr) 
    {
        int current = arr[0];
        int global_sum = arr[0];
        
        // NOTE: here the array starts from 1
        for(int i = 1; i < arr.length; i++)
        {
            // NOTE: Here we are comparing which one is higher value between arr[i] and current + arr[i] 
            current = Math.max(arr[i], arr[i] + current);
            
            if(current > global_sum)
            {
                global_sum = current;
            }
        }
        
        System.out.println(global_sum);
    } 
    
    public static void main(String[] args)
    {      
           int[] arr = new int{ -1, 10, 5, 67, -80, 45};
            // Call maxsum function
            maxSum(arr);
    }
}
