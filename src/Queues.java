import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    private static int front, rear, capacity;
    private static int queue[];

    //Constructor
    public Queues(int size)
    {
        front=rear=0;
        capacity =size;
        queue = new int[capacity];
    }

    public static void enQueue(int data)
    {
        //check if full
        if (capacity == rear){
            System.out.println("Queue is full");
            return;
        }
        else
        {
            queue[rear] = data;
            rear++;
        }
        return;

    }

    public static void deQueue(){

        //check to see if empty
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }
        else {
            //shift all the elements down 1
            for (int i = 0; i < rear-1; i++) {
                queue[i] = queue[i + 1];
            }
            //decrement the rear
            rear--;
            //make the last element 0
            if (rear < capacity)
                queue[rear]=0;


        }
        return;
    }
    public static void print(){
        if (front==rear)
            System.out.println("Queue is empty");
        for (int i:queue)
            System.out.printf(" %d",i);
    }

    public static void main(String[] args) {
        Queues q =new Queues(5);
        enQueue(2);
        enQueue(4);
        enQueue(5);
//        enQueue(5);
        enQueue(6);
//        enQueue(5);
        deQueue();
//        deQueue();

        print();
    }

    ///
}
