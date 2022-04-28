package GraphPackage;
/**
   An interface of methods that create, manipulate, and process a graph.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface GraphInterface<T> extends BasicGraphInterface<T>, 
                                           GraphAlgorithmsInterface<T>
{
   boolean[][] edges; // edges[i][j] is true if there is a vertex from i to j
   E[] labels; // labels[i] contains the label for vertex i

   public Graph(int n)
   {
      edges = new boolean[n][n]; // All values initially false
      labels = (E[]) new Object[n]; // All values initially null
   }


} // end GraphInterface
