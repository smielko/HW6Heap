// Generic code for class priority_queue_heap for Assignment 5 


public class PQ_heap<E extends Comparable<E>>
{
    private Heap<E> PQHeap = new Heap<>();
    // Constructor method
    PQ_heap() {};

    // Return true if priority queue is empty; otherwise return false
    public boolean is_empty()
    {
        return PQHeap.getSize() == 0;
    }

    // Return true if priority queue is full; otherwise return false

    public boolean is_full(int index)
    {
        if (PQHeap.Peek(index) == null) //root is empty
            return true;
        else if (PQHeap.Peek(index*2 + 1) == null && PQHeap.Peek(index*2 + 2) == null) //both children are empty
            return true;
        else if (PQHeap.Peek(index*2 + 1) != null )return is_full(index*2 + 1); //searching left
        else if (PQHeap.Peek(index*2 + 2) != null) return is_full(index*2 + 2); //searching right
        return false;//all conditions failed, the BT is not full
    }
    
     // Return (don't remove) the front element from the priority queue*/
    // Precondition: priority queue is not empty.
    public E front() { //wrapper so i can return null
        if (is_empty())
        {
            System.out.println("Heap is empty");
            return null;
        }
        return  PQHeap.Peek(0);
    }

    // return number of elements in the queue
    public int size()
    {
        return PQHeap.getSize();
    }

    // Remove the largest value from this priority queue and return it.
    // Precondition: priority queue is not empty.
    public E dequeue()
    {
        return (E) PQHeap.remove();
    }

    // Inserts the 'value' into the priority queue.
    // Precondition: priority queue is not full
     public void enqueue(E value)
    {
        PQHeap.add(value);
    };
    public void PrintPQ()
    {
        double height = Math.round(Math.log(PQHeap.getSize()));
        if (height == 0) height++;
        for (int i = 0; i < height; i++)
        {
            System.out.print("Index "+ i +": " + PQHeap.Peek(i) + " ");
            if (PQHeap.Peek(i*2+1) != null && i*2+1 < PQHeap.getSize()-1)
                System.out.print(PQHeap.Peek(i*2+1) + " ");
            if (PQHeap.Peek(i*2+2) != null && i*2+1 < PQHeap.getSize()-1)
                System.out.print(PQHeap.Peek(i*2+2) + " ");
        }
    }
    public int HeapSize()
    {
        return PQHeap.getSize();
    }

};