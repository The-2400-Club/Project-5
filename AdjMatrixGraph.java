import java.util.*;

public class AdjMatrixGraph
{
    int vertices; 
    boolean edges[][];
    boolean visited[];

    public AdjMatrixGraph(int n)
    {
        this.vertices = n;
        edges = new boolean[n][n];
        visited = new boolean[n];
    }

    public void addEdge(int source, int target)
    {
        edges[source][target] = true;
    }

    public int getNumberOfNeighbors(int vertex)
    {
        int num = 0;

        for(int i = 0; i < vertices; i++)
        {
            if(edges[vertex][i])
            {
                num++;
            }
        }

        return num;
    }

    public int[] getNeighbors(int vertex)
    {
        int[] neighbors = new int[getNumberOfNeighbors(vertex)];
        int count = 0;

        for(int i = 0; i < vertices; i++)
        {
            if(edges[vertex][i])
            {
                neighbors[count] = i;
                count++;
            }
        }

        return neighbors;
    }

    public void resetVisitedArray()
    {
        for(int i = 0; i < visited.length; i++)
        {
            visited[i] = false;
        }
    }

    public int[] getBreadthFirstTraversal(int vertex)
    {
        int[] traversal = new int[vertices];
        int count = 0;

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(vertex);
        while(!queue.isEmpty())
        {
            int current = queue.poll();
            if(!visited[current])
            {
                visited[current] = true;
                traversal[count] = current;
                count++;

                int[] neighbors = getNeighbors(current);
                for(int i = 0; i < neighbors.length; i++)
                {
                    queue.add(neighbors[i]);
                } //end for
            } //end if
        } //end while

        resetVisitedArray();
        return traversal;
    } //end getBreadthFirstTraversal

    public int[] getDepthFirstTraversal(int vertex)
    {
        int[] traversal = new int[vertices];
        int count = 0;

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(vertex);
        while(!stack.isEmpty())
        {
            int current = stack.pop();
            if(!visited[current])
            {
                visited[current] = true;
                traversal[count] = current;
                count++;

                int[] neighbors = getNeighbors(current);
                for(int i = neighbors.length - 1; i >= 0 ; i--)
                {
                    stack.push(neighbors[i]);
                } //end for
            } //end if
        } //end while

        resetVisitedArray();
        return traversal;
    } //end getDepthFirstTraversal

}