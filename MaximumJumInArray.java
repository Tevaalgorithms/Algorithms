package maximumjuminarray;

/**
 *
 * @author teva
 */
public class MaximumJumInArray {
  
    static int[] findmax_element_index(int si, int se, int[] input)
    {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int[] res = new int[2];
        for(int i = si +1; i <= si+se; i++)
        {
            if(input[i] > max)
            {
                max = input[i];
                index = i;
            }
        }
        res[0] = max;
        res[1] = index;
        return res;
    }
    
    static int maxjum(int[] input)
    {
        int mj = 0;
        int si = 0;
        int se = input[si];
        if(se < 0) return 0;
        while(se+si < input.length-1)
        {
            int[] res = findmax_element_index(si, se, input);
            se = res[0];
            si = res[1];
            mj++;
        }
        return mj + 1;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] input = new int[]{11, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        int res = maxjum(input);
        System.out.println(res);
    }
    
}
