import java.io.IOException;
 
 /**
 6 * The EmptyQueueException class represents a response from IronMQ indicating
 7 * the queue is empty.
 8 */
public class EmptyQueueException extends IOException {
    /**
11    * Creates a new EmptyQueueException.
12    */
    public EmptyQueueException() {
        super("Queue is empty");
    }
}
