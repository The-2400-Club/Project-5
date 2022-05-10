public class AdjListGraphDriver
{
    public static void main(String[] args)
    {
        AdjListGraph adjList = new AdjListGraph(9);

        adjList.addEdge(0, 1);
        adjList.addEdge(0, 3);
        adjList.addEdge(0, 4);
        adjList.addEdge(1, 4);
        adjList.addEdge(3, 6);
        adjList.addEdge(4, 5);
        adjList.addEdge(4, 7);
        adjList.addEdge(6, 7);
        adjList.addEdge(5, 2);
        adjList.addEdge(5, 7);
        adjList.addEdge(7, 8);
        adjList.addEdge(2, 1);
        adjList.addEdge(8, 5);

        System.out.print("Breadth-First Traversal: ");
        System.out.print(adjList.getBreadthFirstTraversal(0));

        System.out.println("");
        System.out.print("Depth-First Traversal: ");
        System.out.print(adjList.getDepthFirstTraversal(0));
    }

}