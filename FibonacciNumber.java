public class FibonacciNumber 
{   
    // Recursive Approach    
    public static int fib(int n)
    {
        if ( n <= 1)
        {
            return n;
        }
        return fib(n-1) + fib(n-2);    
    }
    
    // Iterative approach
    public static int fib_iterative(int n)
    {
        int a = 0;
        int b = 1;
        int c;
        if(n <= 1)
        {
            return n;
        }
        for(int i = 2; i <= n ; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
     // Bottom up Approach 
    
    public static int fib_bottom_up(int n)
    {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        
        for(int i = 2; i <= n; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }        
        return f[n];
    }
    
    
    // Top Down Approach 
    
    static int[] lookup;
    
    public static void init(int n)
    {
        lookup = new int[n+1];
        
        for(int i=0; i <=n; i++)
        {
            lookup[i] = -1;
        }        
    }    
    
    public static int fib_top_down(int n)
    {
        if(lookup[n] == -1)
        {
           if(n <= 1) 
           {
               lookup[n] = n;
           }
           else
           {
               lookup[n] = fib_top_down(n-1) + fib_top_down(n-2);
           }
        }
        return lookup[n];
    }
    
    public static void main(String[] args) 
    {
        System.out.println("Recursive Fib = " + fib(5) + "\n");
        
        System.out.println("Iterative Fib = " + fib_iterative(5) + "\n");
        
        System.out.println("Dynamic Bottom Up (Tabulation) Fib = " + fib_bottom_up(5) + "\n");
        
        init(5);
        System.out.println("Dynamic  Topdown (Memoization) Fib = " + fib_top_down(5) + "\n");
    }
    
}
