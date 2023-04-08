// Generic code for class priority_queue_heap for Assignment 5 


public class PQ_heap<E>
{
    private Heap<Integer> PQHeap;
    // Constructor method
    PQ_heap() {};

    // Return true if priority queue is empty; otherwise return false
    public boolean is_empty()
    {
        return PQHeap.getSize() <= 0;
    }

    // Return true if priority queue is full; otherwise return false

    /*TODO: public boolean is_full() {};
     // Return (don't remove) the front element from the priority queue*/
    // Precondition: priority queue is not empty.
    public java.lang.Integer front() { //wrapper so i can return null
        if (is_empty())
        {
            System.out.println("Heap is empty");
            return null;
        }
        System.out.println(PQHeap.Peek());
        return PQHeap.Peek();
    }

    // return number of elements in the queue
    public int size()
    {
        return PQHeap.getSize();
    }

    // Remove the largest value from this priority queue and return it.
    // Precondition: priority queue is not empty.
    public int dequeue()
    {
        return PQHeap.remove();
    }

    // Inserts the 'value' into the priority queue.
    // Precondition: priority queue is not full
    public void enqueue(int value)
    {
        PQHeap.add(value);
    };
};