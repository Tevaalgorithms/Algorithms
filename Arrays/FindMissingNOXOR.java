public class FindMissingNOXOR {

    static int getMissingNo(int[] arr)
    {
        int l = arr.length;
        int sourceXOR = 1;
        int arrayXOR = arr[0];
        
        for(int i = 1; i < l; i++)
        {
            arrayXOR = arrayXOR ^ arr[i];
        }
        /* For xor of all the elements  
           from 1 to n+1 */         
        for(int i = 2; i < l + 1; i++)
        {
            sourceXOR = sourceXOR ^ i;
        }
        
        return sourceXOR ^ arrayXOR;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a[] = {1,2,4,5,6}; 
        int miss = getMissingNo(a); 
        System.out.println(miss); 
    }
    
}
