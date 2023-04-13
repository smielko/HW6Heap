// Generic code for class priority_queue_heap for Assignment 5 


public class PQ_heap<E extends Comparable<E>> //Used generics so it can handle both strings and ints
{
    private Heap<E> PQHeap = new Heap<>(); //private heap objext
    // Constructor method
    PQ_heap() {};

    // Return true if priority queue is empty; otherwise return false
    public boolean is_empty()
    {
        return PQHeap.getSize() == 0;
    }

    // Return true if priority queue is full; otherwise return false

    public boolean is_full() //#TODO:
    {
        if (PQHeap.Peek(0) == null) //root is empty
            return true;
        for (int i = 0; i < PQHeap.getSize(); i++)
        {
            System.out.print("Index "+ i +": " + PQHeap.Peek(i) + " ");
            if (i*2+1 < PQHeap.getSize())
                System.out.print(PQHeap.Peek(i*2+1) + " ");
            if (i*2+2 < PQHeap.getSize())
                System.out.print(PQHeap.Peek(i*2+2) + " ");
            System.out.println();
        }
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
    public E dequeue() //dequeues the largest element
    {
        return PQHeap.remove(); //returns value
    }

    // Inserts the 'value' into the priority queue.
    // Precondition: priority queue is not full
    public void enqueue(E value)
    {
        PQHeap.add(value);
    };
    public void PrintPQ()
    {
        for (int i = 0; i < PQHeap.getSize(); i++)
        {
            System.out.print("Index "+ i +": " + PQHeap.Peek(i) + " ");
            if (i*2+1 < PQHeap.getSize())
                System.out.print(PQHeap.Peek(i*2+1) + " ");
            if (i*2+2 < PQHeap.getSize())
                System.out.print(PQHeap.Peek(i*2+2) + " ");
            System.out.println();
        }
    }
    public int HeapSize()
    {
        return PQHeap.getSize();
    }

};