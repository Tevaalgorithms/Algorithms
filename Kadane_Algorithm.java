
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
    
    /*
    Input:
    The first line of input contains an integer T denoting the number of test cases. 
    The description of T test cases follows. 
    The first line of each test case contains a single integer N denoting the size of array. 
    The second line contains N space-separated integers A1, A2, …, AN denoting the elements of the array.
    
    Ouput:
    Print the maximum sum of the contiguous sub-array in a separate line for each test case.
    */
    
    public static void main(String[] args)throws IOException
    {
        BufferedReader input = new BufferedReader( new InputStreamReader(System.in));
        
        //Get the total number of test cases
        String lines = input.readLine();        
        int total_test = Integer.parseInt(lines);
        
        while(total_test > 0)
        {
            // Get the array size of each problem 
            int n = Integer.parseInt(input.readLine());
            
            int arr[] = new int[n];
            
            // Get the elements of array
            String lines1 = input.readLine();
            String[] srs = lines1.trim().split("\\s+");  
            
            for(int i = 0; i < srs.length; i++)
            {
                arr[i] = Integer.parseInt(srs[i]);
            }
            
            // Call maxsum function
            maxSum(arr);
            
            total_test--;
        }
    }
}
