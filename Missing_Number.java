

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Missing_Number 
{
    public static void missing_number(int[] arr)
    {
        int lenght = arr.length;
        // Total number of n continuous integer from 1 to n is : n * (n+1) /2
        // NOTE: Here we need to add + 1 to the array lenght since it's missing an elemenet
        int total = ((lenght + 1) * (lenght + 2)) / 2;
        
        for(int i = 0; i < lenght ; i++)
        {
            total -= arr[i];
        }
        
        System.out.println(total);
                
    }
    
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
            missing_number(arr);
            
            total_test--;
        }
    }
}
