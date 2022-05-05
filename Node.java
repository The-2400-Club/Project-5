public class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
        next = null;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int num)
    {
        data = num;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node nuNode)
    {
        next = nuNode;
    }
}
