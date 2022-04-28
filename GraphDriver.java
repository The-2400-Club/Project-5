public class GraphDriver
{
    public static void main(String[] args)
    {
        Graph graph = new Graph(9);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(6, 7);
        graph.addEdge(5, 2);
        graph.addEdge(5, 7);
        graph.addEdge(7, 8);
        graph.addEdge(2, 1);
        graph.addEdge(8, 5);

        graph.getBreadthFirstTraversal(graph.getLabel(0));
    }
}