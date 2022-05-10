import java.util.*;

public class AdjListGraph
{
    ArrayList<LinkedList<Integer>> list;
    boolean[] visited;
    
    public AdjListGraph(int n)
    {
        list = new ArrayList<LinkedList<Integer>>(); 
        visited = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            list.add(new LinkedList<Integer>());
        }
    }

    public void addEdge(int source, int target)
    {
        list.get(source).add(target);
    }

    public int getNumberOfNeighbors(int num)
    {
        return list.get(num).size();
    }

    public LinkedList<Integer> getNeighbors(int num)
    {
        return list.get(num);
    }

    public void resetVisitedArray()
    {
        for(int i = 0; i < visited.length; i++)
        {
            visited[i] = false;
        }
    }

    public LinkedList<Integer> getBreadthFirstTraversal(int num)
    {
        LinkedList<Integer> traversal = new LinkedList<Integer>();

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(num);
        while(!queue.isEmpty())
        {
            int current = queue.poll();
            if(!visited[current])
            {
                visited[current] = true;
                traversal.add(current);

                LinkedList<Integer> neighbors = getNeighbors(current);
                for(int i = 0; i < neighbors.size(); i++)
                {
                    queue.add(neighbors.get(i));
                } //end for
            } //end if
        } //end while

        resetVisitedArray();
        return traversal;
    }

    public LinkedList<Integer> getDepthFirstTraversal(int num)
    {
        LinkedList<Integer> traversal = new LinkedList<Integer>();

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(num);
        while(!stack.isEmpty())
        {
            int current = stack.pop();
            if(!visited[current])
            {
                visited[current] = true;
                traversal.add(current);

                LinkedList<Integer> neighbors = getNeighbors(current);
                for(int i = neighbors.size() - 1; i >= 0 ; i--)
                {
                    stack.push(neighbors.get(i));
                } //end for
            } //end if
        } //end while

        resetVisitedArray();
        return traversal;
    } //end getDepthFirstTraversal

}