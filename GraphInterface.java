package GraphPackage;

import java.util.Iterator;

/**
   An interface of methods that create, manipulate, and process a graph.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface GraphInterface<T> extends BasicGraphInterface<T>, 
                                           GraphAlgorithmsInterface<T>
{
   public QueueInterface<T> getBreadthFirstTraversal(T origin);

   public QueueInterface<T> getDepthFirstTraversal(T origin);

} // end GraphInterface
