
public class Array_MissingNumber 
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
           int[] arr = new int[]{1, 2, 4, 5, 6, 7, 8};
        
            // Call maxsum function
            missing_number(arr);
    }
}
