// Generic code for class priority_queue_heap for Assignment 5 
// Name: Sebastian Mielko
// Class:CS 3305/Section#03
// Term:Spring 2023
// Instructor:Prof. Majeed
// Assignment:6


public class PQ_heap<E extends Comparable<E>> //Used generics so it can handle both strings and ints
{
    private Heap<E> PQHeap = new Heap<>(); //private heap object
    // Constructor method
    PQ_heap() {};

    // Return true if priority queue is empty; otherwise return false
    public boolean is_empty()
    {
        return PQHeap.getSize() == 0;
    }

    // Return true if priority queue is full; otherwise return false
    public boolean is_full()
    {
        int height = (int) (Math.log(PQHeap.getSize()/ Math.log(2))); //calculating log base 2
            if (PQHeap.getSize() == Math.pow(2,height+1)-1) //equation to check if the heap is full
            return true;
        return false; //baseline condition
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
            System.out.print("Index "+ i +": " + PQHeap.Peek(i) + " "); //index i's value
            if (i*2+1 < PQHeap.getSize()) //left child exists
                System.out.print(PQHeap.Peek(i*2+1) + " ");//left child's value
            if (i*2+2 < PQHeap.getSize())//right child exists
                System.out.print(PQHeap.Peek(i*2+2) + " ");//right child's value
            System.out.println(); //line break
        }
    }
    public int HeapSize()
    {
        return PQHeap.getSize(); //returns size
    }

};