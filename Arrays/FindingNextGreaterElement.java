package findingnextgreaterelement;
import java.util.*;
/**
 *
 * @author velut
 */
public class FindingNextGreaterElement 
{
    // Credit goes to: https://www.ideserve.co.in/learn/next-great-element-in-an-array#codeSnippet    
    public static void printNextGreaterElement(int[] input) 
     {
        Stack<Integer> stack = new Stack<Integer>();
        int inputSize = input.length;
        stack.push(input[0]);
        for (int i = 1; i < inputSize; i++) 
        {
            while (!stack.isEmpty() && stack.peek() < input[i]) 
            {
                System.out.println("Next greater element for " + stack.pop() + "\t = " + input[i]);
            }
            stack.push(input[i]);
        }
        while (!stack.isEmpty()) 
        {
            int top = (int) stack.pop();
            System.out.println("Next greater element for " + top + "\t = " + null);
        }
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr = new int[]{2, 3, 5, 10, 6, 8, 1, 4, 12 ,7, 4};
        printNextGreaterElement(arr);
        
    }    
}
