public class AdjMatrixGraphDriver
{
    public static void main(String[] args)
    {
        AdjMatrixGraph adjMatrix = new AdjMatrixGraph(9);

        adjMatrix.addEdge(0, 1);
        adjMatrix.addEdge(0, 3);
        adjMatrix.addEdge(0, 4);
        adjMatrix.addEdge(1, 4);
        adjMatrix.addEdge(3, 6);
        adjMatrix.addEdge(4, 5);
        adjMatrix.addEdge(4, 7);
        adjMatrix.addEdge(6, 7);
        adjMatrix.addEdge(5, 2);
        adjMatrix.addEdge(5, 7);
        adjMatrix.addEdge(7, 8);
        adjMatrix.addEdge(2, 1);
        adjMatrix.addEdge(8, 5);

        int[] breadthtraversal = adjMatrix.getBreadthFirstTraversal(0);
        int[] depthtraversal = adjMatrix.getDepthFirstTraversal(0);
        
        System.out.print("Breadth-First Traversal: ");
        for(int i = 0; i < breadthtraversal.length; i++)
        {
            System.out.print(breadthtraversal[i]);
        }

        System.out.println("");
        System.out.print("Depth-First Traversal: ");
        for(int i = 0; i < depthtraversal.length; i++)
        {
            System.out.print(depthtraversal[i]);
        }
    }

}