import java.util.*;

public class AdjListGraph
{
    ArrayList<LinkedList<Node>> list;

    public AdjListGraph()
    {
        list = new ArrayList<>();
    }

    public void addNode(Node node)
    {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        list.add(currentList);
    }

    public void addEdge(int source, int target)
    {
        LinkedList<Node> currentList = list.get(source);
        Node targetNode = list.get(target).get(0);
        currentList.add(targetNode);
    }

    public boolean checkEdge(int source, int target)
    {
        LinkedList<Node> currentList = list.get(source);
        Node targetNode = list.get(target).get(0);

        for(Node node : currentList)
        {
            if(node == targetNode) return true;
        }
        return false;

    }

}