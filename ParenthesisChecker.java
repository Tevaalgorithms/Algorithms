import java.util.Stack;


public class ParenthesisChecker 
{
    static Stack<Character> myStack = new Stack<Character>();
    
    public static void checkBalance(String s)
    {
        int l = s.length();
             
        for(int i = 0; i < l; i++)
        {
            char c;
            c = s.charAt(i);
            if((c == '(') || (c == '{') || (c == '['))
            {
                myStack.push(c);
            }
            else
            {  
                if (i==0)
                {
                    System.out.println("not balanced"); 
                    return;
                }
                if(!myStack.empty())
                {
                    if(!checkPair(myStack.peek(), c))
                    {
                        System.out.println("not balanced"); 
                        return;
                    }
                    else
                    {
                         myStack.pop();
                    }
                }
            }
        }
        
        if(!myStack.empty())
        {
           System.out.println("not balanced");
        }
        else
        {
            System.out.println("balanced");
        }
    }
    
    public static boolean checkPair(char s, char e)
    {
       return (s == '(' && e == ')') || (s =='{' && e == '}') || (s == '[' && e ==']');
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String s = "([)";
        myStack.clear();
        checkBalance(s);      
    
    }
    
}
