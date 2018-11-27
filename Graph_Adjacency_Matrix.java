/*
Adjacency Matrix is a 2D array of size V x V where V is the number of vertices in a graph. 
Let the 2D array be adj[][], a slot adj[i][j] = 1 indicates that there is an edge from vertex i to vertex j. 
Adjacency matrix for undirected graph is always symmetric. 
Adjacency Matrix is also used to represent weighted graphs. 
If adj[i][j] = w, then there is an edge from vertex i to vertex j with weight w.

Pros: Representation is easier to implement and follow. 
Removing an edge takes O(1) time. 
Queries like whether there is an edge from vertex ‘u’ to vertex ‘v’ are efficient and can be done O(1).

Cons: Consumes more space O(V^2). 
Even if the graph is sparse(contains less number of edges), it consumes the same space. 
Adding a vertex is O(V^2) time.

Source of this about notes: https://www.geeksforgeeks.org/graph-and-its-representations/
*/

package graph_adjacency_matrix;

public class Graph_Adjacency_Matrix 
{

   private final int vertexCount;
   private final boolean adjMatrix[][];
   
   public Graph_Adjacency_Matrix(int vc)
   {
       this.vertexCount = vc;
       this.adjMatrix = new boolean[vertexCount+1][vertexCount+1];
   }
   
   public void addEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           adjMatrix[src][des] = true;
           adjMatrix[des][src] = true;           
       }
   }
   
   public void removeEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           adjMatrix[src][des] = false;
           adjMatrix[des][src] = false;           
       }
   }
   
   public boolean isEdge(int src, int des)
   {
       if((src >=0 && src<=vertexCount) && (des >=0 && des <=vertexCount))
       {
           return adjMatrix[src][des];
       }
       else
       {
           return false;
       }
   }
   
   public void printGraph(Graph_Adjacency_Matrix graph)
   {
        System.out.println("Adjacency Matrix of vertex" + graph.vertexCount);
        for(int i = 0; i <= graph.vertexCount; i++)
         {
             for (int j = 0; j <= graph.vertexCount ; j++)
             {
                 if(graph.isEdge(i, j))
                 {
                      System.out.print("Connected Edeges:   " + i + "---" + j + "\n");
                 }
             }
         }
         System.out.println("\n");
   }
   
   
   
   
    public static void main(String[] args) 
    {
         Graph_Adjacency_Matrix graphAdjMatrix = new Graph_Adjacency_Matrix(4);
         graphAdjMatrix.addEdge(1, 2);        
         graphAdjMatrix.addEdge(2, 3);
         graphAdjMatrix.addEdge(3, 4);
         graphAdjMatrix.addEdge(4, 1);
         graphAdjMatrix.addEdge(1, 3); 
         
         graphAdjMatrix.printGraph(graphAdjMatrix);
    }
    
}
