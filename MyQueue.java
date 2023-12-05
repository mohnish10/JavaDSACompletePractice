package practiceprogramsforjavadsa;

public class MyQueue
{
    int queueLength = 6;

    int[] arr = new int[queueLength];

    int front = -1,rear = -1;


    public boolean queueIsEmpty()
    {

        return front == -1 && rear == -1;
    }


    public boolean queueIsFull()
    {

        return rear == queueLength - 1;
    }


    public void display() {
        if (queueIsEmpty()) {

            System.out.println("There are no elements to display");
        } else {
            for (int i = front; i <= rear; i++) {

                System.out.print(arr[i]+" ");
            }
        }
    }


    public void enqueue(int data)
    {


        if(queueIsEmpty())
        {

            front++;

            rear++;

            arr[rear] = data;

        }
        else if(queueIsFull())
        {

            System.out.println("Elements cannot be enqueued anymore");

        }
        else
        {
            rear++;

            arr[rear] = data;
        }
    }


    public int dequeue()
    {

        if(queueIsEmpty())
        {

            System.out.println("There are no elements to remove");

            return 0;
        }
        else
        {

            front++;

            return arr[front];
        }

    }


    public int peek()
    {

        return arr[front];
    }

    public static void main(String[] args)
    {

        MyQueue my = new MyQueue();

        System.out.println("Is the queue empty?- "+my.queueIsEmpty());

        my.enqueue(10);

        my.enqueue(20);

        my.enqueue(30);

        my.enqueue(40);

        my.enqueue(50);

        my.enqueue(60);

        System.out.println("Is the queue empty now:- "+my.queueIsEmpty());

        System.out.print("Displaying the queue elements now:- ");

        my.display();

        System.out.println();

        System.out.println("The element at the front of the queue is:- "+my.peek());

        my.dequeue();

        System.out.println("The element at the front of the queue after the first dequeue operation is:- "+my.peek());

        System.out.print("Displaying the queue elements again:- ");

        my.display();






    }





}
