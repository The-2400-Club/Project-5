public class AdjListGraphDriver
{
    public static void main(String[] args)
    {
        AdjListGraph adjList = new AdjListGraph();

        adjList.addNode(new Node(0));
        adjList.addNode(new Node(1));
        adjList.addNode(new Node(2));
        adjList.addNode(new Node(3));
        adjList.addNode(new Node(4));
        adjList.addNode(new Node(5));
        adjList.addNode(new Node(6));
        adjList.addNode(new Node(7));
        adjList.addNode(new Node(8));

        adjList.addEdge(0, 1);
        adjList.addEdge(0, 3);
        adjList.addEdge(0, 4);
        adjList.addEdge(1, 4);
        adjList.addEdge(3, 6);
        adjList.addEdge(4, 5);
        adjList.addEdge(3, 7);
        adjList.addEdge(6, 7);
        adjList.addEdge(5, 2);
        adjList.addEdge(5, 7);
        adjList.addEdge(7, 8);
        adjList.addEdge(2, 1);
        adjList.addEdge(8, 5);

    }

}