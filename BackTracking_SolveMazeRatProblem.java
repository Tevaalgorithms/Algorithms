/*
 If destination is reached
    print the solution matrix
 Else
   a) Mark current cell in solution matrix as 1. 
   b) Move forward in the horizontal direction and recursively check if this 
       move leads to a solution. 
   c) If the move chosen in the above step doesn't lead to a solution
       then move down and check if this move leads to a solution. 
   d) If none of the above solutions works then unmark this cell as 0 
       (BACKTRACK) and return false.
 */
 
 
package solvemazeratproblem;
import java.util.Stack;
public class BackTracking_SolveMazeRatProblem 
{
    // Here we are considering only 4 * 4 maze field
    static int N = 4;
    
    // this is for storing the directions of the path
    static Stack stack = new Stack();
    
    // this function will return TRUE in the following conditions. 
    // a. x should be in the maze field and y should be in the maze field range
    // b. When the maze field has 1 in the given x and y. That means that path is available
    static boolean isSafe(int maze[][], int x, int y)
    {
        return (x >=0 && x < N && y >=0 && y < N && maze[x][y] == 1);
    }
    
    // for printing the solution.
    static void printSolution(int sol[][]) 
    { 
        for (int i = 0; i < N; i++) 
        { 
            for (int j = 0; j < N; j++) 
                System.out.print(" " + sol[i][j] + 
                                 " "); 
            System.out.println(); 
        } 
    } 
    
    // this will call the main algorithm with the empty solution matrix
    static boolean solveMaze(int maze[][]) 
    { 
        // Solution matrix, in the beginning every cell value is assigned with 0.
        int sol[][] = {
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0} 
        }; 
        
        // Call the main algorithm with maze and left corener (x, y) values, with solution matrix
        if (solveMazeUtil(maze, 0, 0, sol) == false) 
        { 
            System.out.print("Solution doesn't exist"); 
            return false; 
        } 
  
        printSolution(sol); 
        
        while(!stack.isEmpty())
        {
           System.out.print(stack.pop());           
        }
        System.out.print("\n");        
        return true; 
    } 
    
    static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][])
    {   
        // Step 1: checking whether we reached the desination or not. 
        if(x == N -1 && y == N -1)
        {
            sol[x][y] = 1;
            return true;
        }
        // Step 2: Check whether the given x, and y values are inside the boundary of maze field 
        // AND it's an open path of not.
        if (isSafe(maze, x, y) == true)
        {
            // assign 1 to the given x, y in the solution matrix
            sol[x][y] = 1;
            
            // move downwards and call solveMazeUtil recursively 
            if(solveMazeUtil(maze, x+1, y, sol))
            {
                stack.push("D");
                return true;
            }            
            
            // move right direction and call solveMazeUtil recursively 
            if(solveMazeUtil(maze, x, y+1, sol))
            {
                stack.push("R");
                return true;
            }
            
            // BACK TRACKING and change the x, y value to 0 when function fails.
            sol[x][y] = 0;                   
            return false;
        }        
        return false;
    }
    
    public static void main(String[] args) 
    {
        int maze[][]= {
                        {1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1}
                      };
        
         int maze2[][]= {
                        {1, 1, 0, 0},
                        {1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}
                      };
         
         int maze3[][] = {
             {1, 0, 0, 0},
             {1, 1, 0, 1},
             {1, 1, 0, 0},
             {0, 1, 1, 1},
         };
      
        solveMaze(maze2); 
    }
    
}
